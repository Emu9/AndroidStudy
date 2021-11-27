package android.study.prototype_todo.utility;

import android.app.Application;
import android.content.Context;

/**
 * Applicationを継承したクラス。
 * 起動時にContextをシングルトンで保持し続けることで、
 * どこからでもContextを参照することが出来る。
 * 覚えると非常に便利なテクニックです。
 * ※必ずAndroidManifestに追記が必要です。android:name=".model.utility.MyContext"
 */
public class MyContext extends Application {

    private static MyContext sInstance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }

    public static Context getContext() {
        return sInstance.getApplicationContext();
    }
}
