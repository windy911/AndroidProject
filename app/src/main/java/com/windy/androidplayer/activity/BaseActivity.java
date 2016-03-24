package com.windy.androidplayer.activity;

import android.app.Activity;
import android.os.Bundle;

import com.windy.androidplayer.network.HttpService;

/**
 * Created by Rambo on 15/8/19.
 */
public class BaseActivity extends Activity {

    public HttpService httpService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        httpService = new HttpService();
    }



}
