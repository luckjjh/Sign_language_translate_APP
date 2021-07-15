package com.example.handtalk;

import android.app.Application;

public class MyApp extends Application {
    private String gValue;
    @Override
    public void onCreate() {
        super.onCreate();
        gValue = "Z";
    }
    public String getgValue(){
        return gValue;
    }
    public void setgValue(String mV){
        this.gValue=mV;
    }
}
