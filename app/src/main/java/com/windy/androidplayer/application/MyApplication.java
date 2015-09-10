package com.windy.androidplayer.application;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by windy on 15/8/19.
 */
public class MyApplication extends Application {


    public static MyApplication instance;
    private RequestQueue mQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initApplication();
    }

    private void initApplication() {

    }


    public synchronized RequestQueue getRequestQueue() {
        if (mQueue == null) {
            mQueue = Volley.newRequestQueue(instance);
        }
        return mQueue;
    }


}
