package com.windy.androidplayer.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by windy on 16/2/25.
 * Dialog 工具类
 */
public class DialogUtils {

    public static void showToast(Context context, String message) {
        if (context != null) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        }
    }

}
