package one.example.sample.therd;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.sample.R;

import one.example.sample.UtilLog;


/**
 * 第３回、第４回あたりでやること
 * ▼UIパーツの実装を兼ねてログイン画面とTODOリストの作成
 * ①Button,TextView,EditText,LinearLayoutを使って画面の作成(ログイン画面を想定)
 * ②リスナーの実装(ボタン押下時の判定、画面遷移)
 * ③RecyclerViewの実装(データクラス、Adapterクラス、ViewHolderクラス)
 */
public class SampleFragment3 extends Fragment {

    public SampleFragment3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample3, container, false);
    }


    /**
     * ユーザー
     */
    private static final String USER_ID = "USER";

    private static final String PASSWORD = "PASSWORD";

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // 入力した文字を取得して、logに表示してみよう
        Log.d("TAG", "★　出力LOG");

        // EditTextの変数を用意
        EditText editTextUserName = view.findViewById(R.id.edit_text_user_name);
        EditText editTextPassWord = view.findViewById(R.id.edit_text_password);
        // Button
        Button button = view.findViewById(R.id.button_login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "★　ユーザーの判定 : ok");
            }
        });

        // ボタンにリスナーを設定
        button.setOnClickListener(v -> {

            // EditText の中身を取得
            // String userName = editTextUserName.getText().toString();
            String userName = editTextUserName.getText().toString();
            String password = editTextPassWord.getText().toString();

            // ユーザーの判定
            if (userName.equals(USER_ID)) {
                Log.d("TAG", "★　ユーザーの判定 : ok");
            }
            // パスワードの判定
            if (password.equals(PASSWORD)) {
                Log.d("TAG", "★　パスワードの判定 : ok");
            }
            // それをログに出力
            Log.d("TAG", "★　userName : " + userName);
            Log.d("TAG", "★　password : " + password);
            // Todo ハードコーディングしたユーザーとパスワードが一致したら画面遷移を行う。

            // 処理
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_layout_main, new TodoFragment());
            transaction.commit();
        });

        UtilLog.d();
        // TextView
        // EditText
        // LinearLayout
    }
}