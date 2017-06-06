package com.xushuai.xutils;

import android.app.Application;

import org.xutils.x;

/**
 * date:2017/6/6
 * author:徐帅(acer)
 * funcation:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        //是否输出Debug日志，开启Debug会影响性能
        x.Ext.setDebug(true);
    }
}