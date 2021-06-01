package com.example.handtalk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton cBtn;
    Button bBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cBtn=findViewById(R.id.cam_btn);
        cBtn.setClickable(true);
        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent camIntent=new Intent(MainActivity.this,camActivity.class);
                startActivity(camIntent);
            }
        });
        bBtn=(Button) findViewById(R.id.blue_btn);
        bBtn.setClickable(true);
        bBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent blueIntent=new Intent(MainActivity.this,blueActivity.class);
                startActivity(blueIntent);
            }
        });
    }
}