package com.example.practices;

import android.util.Log;

public class PracticeLog {
    public static void d(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.d("(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")", msg);
    }

    public static void i(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.i("(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")", msg);
    }

    public static void e(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.e("(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")", msg);
    }
}
