package com.xsl.changeskin;

import android.app.Application;

import com.xsl.skincore2.SkinManager;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.init(this);
    }
}
