package com.windy.androidplayer.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by windy on 16/1/14.
 */
public class MyToast {
    public static void showToast(Context context, String message) {
        if (context != null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }
}
