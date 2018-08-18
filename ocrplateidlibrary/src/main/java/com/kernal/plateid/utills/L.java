package com.kernal.plateid.utills;

import android.util.Log;

public class L {
    public static boolean isDebug = true;
    private static final String TAG = "xinxinzhuguan";

    public static void i(String msg){
        if(isDebug) {
            Log.i(TAG, msg);
        }
    }

    public static void d(String msg){
        if(isDebug) {
            Log.d(TAG, msg);
        }
    }

    public static void e(String msg){
        if(isDebug) {
            Log.e(TAG, msg);
        }
    }

    public static void v(String msg){
        if(isDebug) {
            Log.v(TAG, msg);
        }
    }

    public static void i(String tag, String msg){
        if(isDebug) {
            Log.i(tag, msg);
        }
    }

    public static void d(String tag, String msg){
        if(isDebug) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg){
        if(isDebug) {
            Log.e(tag, msg);
        }
    }

    public static void v(String tag, String msg){
        if(isDebug) {
            Log.v(tag, msg);
        }
    }
}
