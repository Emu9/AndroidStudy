package android.study.prototype_todo;

import android.os.Bundle;
import android.study.prototype_todo.utility.ExpansionLog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

/**
 * 新規プロジェクト -> 下部ナビゲーションアクティビティ
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ExpansionLog.d("Start");

        // 画面生成
        setContentView(R.layout.activity_main);

        // 変数宣言 ※ここではまだナビゲーションは動作しない。
        BottomNavigationView navView = findViewById(R.id.nav_view);

        // 各メニューのIDをIdsのセットとして渡します。
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

        // ここで初めてナビゲーションが動作する。 4行1セット
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        ExpansionLog.d("End");

    }

}