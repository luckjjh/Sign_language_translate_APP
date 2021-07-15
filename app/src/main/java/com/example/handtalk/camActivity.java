package com.example.handtalk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.kimkevin.hangulparser.HangulParser;
import com.github.kimkevin.hangulparser.HangulParserException;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class camActivity extends AppCompatActivity {
    MyApp myApp = (MyApp) getApplication();
    private WebView mWebView;
    TextView result;
    TextView nowInputT;
    private String myUrl = "https://admiring-boyd-84742a.netlify.app";// 접속 URL (내장HTML의 경우 왼쪽과 같이 쓰고 아니면 그냥 URL)
    public List<String> jasolist = new ArrayList<String>();
    String dominantV;
    Handler tH = new Handler();
    Button clearBtn;
    String lastestHangul = "";
    String lastestHnagul = "z";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam);
        result = (TextView) findViewById(R.id.resultTextView);
        nowInputT = (TextView) findViewById(R.id.nowInputTextView);
        clearBtn = (Button) findViewById(R.id.clearButton);
        // 웹뷰 셋팅
        mWebView = (WebView) findViewById(R.id.webView);//xml 자바코드 연결
        mWebView.getSettings().setJavaScriptEnabled(true);//자바스크립트 허용

        mWebView.loadUrl(myUrl);//웹뷰 실행
        mWebView.setWebViewClient(new WebViewClientClass());//새창열기 없이 웹뷰 내에서 다시 열기//페이지 이동 원활히 하기위해 사용


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//디버깅 용 코드
            WebView.setWebContentsDebuggingEnabled(true);
        }
        mWebView.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onPermissionRequest(PermissionRequest request) {//카메라 권한 부여 코드
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    request.grant(request.getResources());
                }
            }
            public boolean onConsoleMessage(ConsoleMessage cm){
                Log.v("//////////////////",cm.message());
                dominantV = cm.message();
                return true;
            }
        });
        new Thread(new Runnable() {
            boolean isRun = false;
            @Override
            public void run() {
                isRun = true;
                while((isRun)){
                    tH.post(new Runnable() {
                        @Override
                        public void run() {
                            //do stuff
                            MyApp myApp = (MyApp)getApplicationContext();
                            String hangul = "";
                            if(dominantV!=null&&dominantV.equals("BHD")){
                                if(myApp.getgValue().equals("A")){
                                    jasolist.add("ㄱ");
                                    setResultText(hangul);
                                    lastestHnagul = "ㄱ";
                                }
                                else if(myApp.getgValue().equals("B")){
                                    jasolist.add("ㅅ");
                                    setResultText(hangul);
                                    lastestHnagul = "ㅅ";
                                }
                                else if(myApp.getgValue().equals("F")){
                                    jasolist.add("ㅈ");
                                    setResultText(hangul);
                                    lastestHnagul = "ㅈ";
                                }
                                else if(myApp.getgValue().equals("H")){
                                    jasolist.add("ㅋ");
                                    lastestHnagul = "ㅋ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("K")){
                                    jasolist.add("ㅜ");
                                    lastestHnagul = "ㅜ";
                                    setResultText(hangul);
                                }
                                /*else if(myApp.getgValue().equals("ㅠ")){
                                    jasolist.add("ㅅ");
                                    lastestHnagul = "ㅅ";
                                    setResultText(hangul);
                                }*/
                                else if(myApp.getgValue().equals("M")){
                                    jasolist.add("ㅟ");
                                    lastestHnagul = "ㅟ";
                                    setResultText(hangul);
                                }
                                else{
                                    nowInputT.setText(" ");
                                }
                            }
                            else if(dominantV!=null&&dominantV.equals("BHL")){
                                if(myApp.getgValue().equals("A")){
                                    jasolist.add("ㄴ");
                                    setResultText(hangul);
                                    lastestHnagul = "ㄴ";
                                }
                                else if(myApp.getgValue().equals("B")){
                                    jasolist.add("ㄷ");
                                    lastestHnagul = "ㄷ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("C")){
                                    jasolist.add("ㄹ");
                                    lastestHnagul = "ㄹ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("K")){
                                    jasolist.add("ㅡ");
                                    lastestHnagul = "ㅡ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("M")){
                                    jasolist.add("ㅢ");
                                    lastestHnagul = "ㅢ";
                                    setResultText(hangul);
                                }
                                else{
                                    nowInputT.setText(" ");
                                }
                            }
                            else if(dominantV!=null&&dominantV.equals("BHU")){
                                if(myApp.getgValue().equals("K")){
                                    jasolist.add("ㅗ");
                                    lastestHnagul = "ㅗ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("B")){
                                    jasolist.add("ㅛ");
                                    lastestHnagul = "ㅛ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("M")){
                                    jasolist.add("ㅚ");
                                    lastestHnagul = "ㅚ";
                                    setResultText(hangul);
                                }//
                                else{
                                    nowInputT.setText(" ");
                                }
                            }
                            else if(dominantV!=null&&dominantV.equals("FHR")){
                                if(myApp.getgValue().equals("K")){
                                    jasolist.add("ㅓ");
                                    setResultText(hangul);
                                    lastestHnagul = "ㅓ";
                                }
                                else if(myApp.getgValue().equals("B")){
                                    jasolist.add("ㅕ");
                                    lastestHnagul = "ㅕ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("J")){
                                    jasolist.add("ㅎ");
                                    lastestHnagul = "ㅎ";
                                    setResultText(hangul);
                                }
                                else{
                                    nowInputT.setText(" ");
                                }
                            }
                            else if(dominantV!=null&&dominantV.equals("FHU")){
                                /*if(myApp.getgValue().equals("B")){
                                    jasolist.add("ㅁ");
                                    setResultText(hangul);
                                }*/
                                if(myApp.getgValue().equals("D")){
                                    jasolist.add("ㅂ");
                                    lastestHnagul = "ㅂ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("K")){
                                    jasolist.add("ㅏ");
                                    lastestHnagul = "ㅏ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("B")){
                                    jasolist.add("ㅑ");
                                    lastestHnagul = "ㅑ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("L")){
                                    jasolist.add("ㅣ");
                                    lastestHnagul = "ㅣ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("M")){
                                    jasolist.add("ㅐ");
                                    lastestHnagul = "ㅐ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("N")){
                                    jasolist.add("ㅒ");
                                    lastestHnagul = "ㅒ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("I")){
                                    jasolist.add("ㅍ");
                                    lastestHnagul = "ㅍ";
                                    setResultText(hangul);
                                }
                                else{
                                    nowInputT.setText(" ");
                                }
                            }
                            else if(dominantV!=null&&dominantV.equals("PIS")){
                                if(myApp.getgValue().equals("M")){
                                    jasolist.add("ㅔ");
                                    lastestHnagul = "ㅔ";
                                    setResultText(hangul);
                                }
                                else if(myApp.getgValue().equals("N")){
                                    jasolist.add("ㅖ");
                                    lastestHnagul = "ㅖ";
                                    setResultText(hangul);
                                }
                            }
                        }
                    });
                    try{
                        sleep(5000);
                    }catch (Exception e){
                    }
                }
            }
        }).start();
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jasolist.clear();
                result.setText("");
            }
        });
    };

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {//뒤로가기 버튼 이벤트
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {//웹뷰에서 뒤로가기 버튼을 누르면 뒤로가짐
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.d("check URL",url);
            view.loadUrl(url);
            return true;
        }
    }

    public void setResultText(String h){
        Log.d("/////////",lastestHangul);
        if(!jasolist.isEmpty()){
            nowInputT.setText(jasolist.get(jasolist.size()-1));
        }
        if (!(lastestHangul.equals(jasolist.get(jasolist.size()-1)))){
            try {
                h = HangulParser.assemble(jasolist);
                result.setText(h);
            }catch (HangulParserException e){
                result.setText("잘못된 입력입니다.");
                e.printStackTrace();
            }
        }
    }
}