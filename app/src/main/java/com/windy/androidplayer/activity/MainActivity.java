package com.windy.androidplayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.windy.androidplayer.R;
import com.windy.androidplayer.utils.Mylog;

import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends BaseActivity {
    public static final String TAG = MainActivity.class.getSimpleName();

    @Bind(R.id.tvTest0)
    TextView tvText0;
    @Bind(R.id.tvTest1)
    TextView tvText1;
    @Bind(R.id.tvTest2)
    TextView tvText2;
    @Bind(R.id.tvTest3)
    TextView tvText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    public void initView() {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.tvTest0, R.id.tvTest1, R.id.tvTest2, R.id.tvTest3})
    public void OnViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tvTest0:
                Intent intent = new Intent(MainActivity.this, PullToRefreshTestActivity.class);
                startActivity(intent);
                break;
            case R.id.tvTest1:
                testRequest();
                break;
            case R.id.tvTest2:
                testRequest2();
                break;
            case R.id.tvTest3:
                break;
        }
    }


    public void testRequest() {

        String httpUrl = "http://www.baidu.com";


        httpService.postStringRequest(Request.Method.GET, httpUrl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Mylog.d(TAG, "onResponse: " + s);
                    }
                },
                new ErrorListener() {
                    @Override
                    public void warning(TransformerException exception) throws TransformerException {

                    }

                    @Override
                    public void error(TransformerException exception) throws TransformerException {

                    }

                    @Override
                    public void fatalError(TransformerException exception) throws TransformerException {

                    }
                }
        );
    }

    public void testRequest2() {

        String httpUrl = "http://www.baidu.com";
        HashMap<String, String> map = new HashMap<>();
        map.put("K", "V");


        httpService.postStringRequest(Request.Method.POST, httpUrl, map, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        Mylog.d(TAG, "onResponse: " + s);
                    }
                },
                new ErrorListener() {
                    @Override
                    public void warning(TransformerException exception) throws TransformerException {

                    }

                    @Override
                    public void error(TransformerException exception) throws TransformerException {

                    }

                    @Override
                    public void fatalError(TransformerException exception) throws TransformerException {

                    }
                }
        );
    }
}
