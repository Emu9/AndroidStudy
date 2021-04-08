package com.example.sample.therd;

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

import com.example.sample.R;

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
    //画面の生成
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample3, container, false);
    }


    private static final String USER_ID = "USER";
    private static final String PASSWORD = "PASSWORD";

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        Log.d("TAG", USER_ID);
        Log.d("TAG", PASSWORD);

        //EditTextの変数を用意
        EditText editTextUserName = view.findViewById(R.id.edit_text_user_name);
        EditText editTextPassword = view.findViewById(R.id.edit_text_password);

        //Buttonの変数を用意
        Button button = view.findViewById(R.id.button_login);

        //ボタンにリスナーを設定
        button.setOnClickListener(v -> {
            //クリックされたときの処理を記述

            //EditText内のTextを取得
            String userName = editTextUserName.getText().toString();
            String password = editTextPassword.getText().toString();

            //ユーザーの判定
            if (userName.equals(USER_ID)) {
                Log.d("TAG", "★　ユーザーの判定　：　ok");
            }
            ;

            //パスワードの判定
            if (password.equals(PASSWORD)) {
                Log.d("TAG", "★　パスワードの判定　：　ok");
            }
            Log.d("TAG", "userName : " + USER_ID);
            Log.d("TAG", "password : " + PASSWORD);

            // ToDo ハードコーディングしたユーザーとパスワードが一致したら画面遷移を行う。

        });
    }
}