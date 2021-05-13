package one.example.sample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.sample.R;

import one.example.sample.fourth.FourthFragment;

public class MainActivity extends AppCompatActivity {

    /**
     * Activityにはライフサイクルが存在します。※コンポーネントの一種
     * ライフサイクルはActivity起動時に動き出しますが、
     * その中にあるonCreate()に初期処理を書きます。所謂Mainクラス的な感じです。
     */
    @Override // ←アノテーションって言います。この場合のOverrideは継承しているクラスにあるonCreate()クラスを上書きしてるという意味。
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // superを頭につけると継承元を呼び出します。
        setContentView(R.layout.activity_main); // xmlとの紐づけ。Activityで行います。

        // frame_layout_mainの範囲内をnew ItemFragment()でreplace(置換)。これを行うことにより、画面遷移を表現している。
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout_main, new FourthFragment());
        transaction.commit();
    }

}