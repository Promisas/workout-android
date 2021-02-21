package com.example.workout;

import android.app.Application;
import android.content.Context;

public class MyWorkoutApplication extends Application {

    private static MyWorkoutApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
    public static MyWorkoutApplication getInstance() {
        return sInstance;

    }
    public static Context getAppContext () {
        return sInstance.getApplicationContext();

    }
}
