package com.windy.androidplayer.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.windy.androidplayer.R;
import com.windy.androidplayer.activity.BaseActivity;
import com.windy.androidplayer.view.pulltorefresh.ui.XScrollViewActivity;


public class PullToRefreshTestActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        Button listBrn = (Button) findViewById(R.id.list_view_btn);
        listBrn.setOnClickListener(this);

        Button scrollBrn = (Button) findViewById(R.id.scroll_view_btn);
        scrollBrn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.list_view_btn:
                com.windy.androidplayer.view.pulltorefresh.ui.XListViewActivity.launch(this);
                break;

            case R.id.scroll_view_btn:
                XScrollViewActivity.launch(this);
                break;
        }
    }
}
