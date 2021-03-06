package com.example.vmann.mapbox.main;

import android.app.Application;
import android.content.Context;
import android.os.Environment;

public class MyApplication extends Application {

    private static Context instance;
    public static final String appFolderName = "GHiO-CA";
    public static final String appFolderPath = Environment.getExternalStoragePublicDirectory(
            Environment.DIRECTORY_PICTURES).getAbsolutePath() + "/" + appFolderName;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Context getAppContext() {
        return instance;
    }
}