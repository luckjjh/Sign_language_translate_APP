package com.example.handtalk;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
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

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class camActivity extends AppCompatActivity {
    MyApp myApp = (MyApp) getApplication();
    private WebView mWebView;
    TextView result;
    TextView result2;
    int count = 0;
    private String myUrl = "https://admiring-boyd-84742a.netlify.app";// 접속 URL (내장HTML의 경우 왼쪽과 같이 쓰고 아니면 걍 URL)
    public List<String> videoValue = new ArrayList<String>();
    public List<String> jasolist = new ArrayList<String>();
    String hangul = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cam);
        result = (TextView) findViewById(R.id.resultTextView);
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
                //Log.d("///", cm.message().substring(0,cm.message().length()));
                //Log.d("///", cm.message().substring(5,9));
                Log.d("//",cm.message());
                result.setText(cm.message());
                return true;
            }
        });
        /*
        Log.d("aaaaaaaaaaaaa",String.valueOf(((MyApp) getApplication()).getgValue()));


        for(int i=0;i<videoValue.size();i++){
            Log.i("aaaa", videoValue.get(i));
        }
        String input = String.valueOf(((MyApp) getApplication()).getgValue());
        if(result.getText().toString()==" BHD: 1.00//BHL: 0.00//BHU: 0.00//FHU: 0.00//FHR: 0.00//PIS: 0.00//"){
            result2.setText("고라니");
        }

        try{
            hangul = HangulParser.assemble(jasolist);
            result.setText(hangul);
        }catch (HangulParserException e){
            e.printStackTrace();
        }
        //String.valueOf(myApp.getgValue()); char 스트링 변환환
        videoValue.clear();
        */
    }

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
}