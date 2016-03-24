package com.windy.androidplayer.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * sharePreference帮助类
 *
 * @author Rambo
 */
public class SPHelp {

    public static SPHelp INSTANCE;
    private SharedPreferences preferences;
    private static final String SP_NAME = "local_sp";

    public static synchronized SPHelp getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SPHelp();
            INSTANCE.preferences = context.getSharedPreferences(SP_NAME, 0);
        }

        return INSTANCE;
    }

    /**
     * 存储Int 的值
     *
     * @param key
     * @param value
     */
    public void setStirngValue(String key, int value) {
        preferences.edit().putInt(key, value).commit();
    }

    /**
     * 获取int 的值
     */
    public int getIntValue(String key) {
        if (preferences.contains(key)) {
            return preferences.getInt(key, 0);
        }
        return 0;
    }

    /**
     * 存储String 的值
     *
     * @param key
     * @param value
     */
    public void setStirngValue(String key, String value) {
        preferences.edit().putString(key, value).commit();
    }

    /**
     * 获取String 的值
     */
    public String getStringValue(String key) {
        if (preferences.contains(key)) {
            return preferences.getString(key, "");
        }
        return "";
    }

    /**
     * 存储Boolean 的值 ；
     *
     * @param key
     * @param value
     */
    public void setBooleanValue(String key, boolean value) {
        preferences.edit().putBoolean(key, value).commit();
    }

    /**
     * 获取Boolean值
     *
     * @param key
     * @return
     */
    public boolean getBooleanValue(String key, boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }

    /**
     * @throws
     * @Title: get3gValue
     * @Description: 获取默认值为true的方法
     * @param: key
     * @param:
     * @return: boolean
     */
    public boolean getBoolValue(String key) {
        return preferences.getBoolean(key, true);
    }

}
