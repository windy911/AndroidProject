package com.windy.androidplayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.windy.androidplayer.R;


import butterknife.ButterKnife;

/**
 * Created by windy on 15/8/20.
 */
public class SplashActiivty extends BaseActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        ButterKnife.bind(this);
        handler.sendEmptyMessageDelayed(0,2000);
    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            go2MainActivity();
        }
    };

    private void go2MainActivity()
    {
        Intent intent = new Intent(SplashActiivty.this,MainSlideMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
