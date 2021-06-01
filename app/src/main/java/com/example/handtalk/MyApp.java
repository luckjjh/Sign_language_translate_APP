package com.example.handtalk;

import android.app.Application;

public class MyApp extends Application {
    private static char gValue = '0';

    public char getgValue(){
        return gValue;
    }
    public void setgValue(char mV){
        this.gValue=mV;
    }
}
