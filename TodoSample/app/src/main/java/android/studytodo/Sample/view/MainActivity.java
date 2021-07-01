package android.studytodo.Sample.view;

import android.os.Bundle;
import android.studytodo.Sample.R;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // メニュー(上部)の設定
        setSupportActionBar(findViewById(R.id.toolbar));

        // Fragmentの起動
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new ListFragment());
        transaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // メニュー(上部)の追加 Todo アプリ全体を通してボタンを配置したい場合はActivityで設定する。
        // getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    // Todo Activityで設定するとFragment側に設定してもActivity側の設定に引っ張られるので注意。
    // @Override
    // public boolean onOptionsItemSelected(MenuItem item) {
    //
    //     // switch (item.getItemId()) {
    //     //     case R.id.add_button:
    //     //         // ボタンをタップした際の処理を記述
    //     //         ExpansionLog.d("ボタン押下");
    //     //         break;
    //     // }
    //     return true;
    // }
}