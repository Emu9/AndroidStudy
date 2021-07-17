package android.study.todo.log;

import android.util.Log;

public class ExpansionLog {
    public static void d(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.d(calledClass.getFileName(), msg + "(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")");
    }

    public static void i(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.i(calledClass.getFileName(), msg + "(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")");
    }

    public static void e(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.e(calledClass.getFileName(), msg + "(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")");
    }
}
