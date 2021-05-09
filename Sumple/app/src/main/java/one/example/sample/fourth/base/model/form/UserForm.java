package one.example.sample.fourth.base.model.form;

import android.graphics.Bitmap;

/**
 * データクラス<br>
 * データクラスとは、データを保持するだけのクラス。<br>
 * 例えばデータベースやファイル(Jsonファイル等)からデータを読み込んだ場合、<br>
 * 読み込んだデータをクラスに保存してプログラム中で使用することがあるので、<br>
 * その場合に使用するのがデータクラスです。<br>
 * 現場でもばりばり使ってます。
 */
public class UserForm {
    private Bitmap mIcon; // Todo DBから画像を取得する場合では、DBからはバイナリファイルで取得する事になると思うので、本来はバイナリで良いかもしれません。表示時にバイナリ→画像と変換を行うと良いかもです。
    private String mName;
    private String mAge;

    public Bitmap getIcon() {
        return mIcon;
    }

    public void setIcon(Bitmap icon) {
        mIcon = icon;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getAge() {
        return mAge;
    }

    public void setAge(String age) {
        mAge = age;
    }
}
