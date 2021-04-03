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
import androidx.fragment.app.FragmentTransaction;

import com.example.sample.R;
import com.example.sample.second.SampleFragment2;

/**
 * 第３回、第４回あたりでやること
 * ▼UIパーツの実装を兼ねてログイン画面とTODOリストの作成
 * ①Button,TextView,EditText,LinearLayoutを使って画面の作成(ログイン画面を想定)
 * ②リスナーの実装(ボタン押下時の判定、画面遷移)
 * ③RecyclerViewの実装(データクラス、Adapterクラス、ViewHolderクラス)
 */
public class SampleFragment3 extends Fragment {

    final String USENAME = "ushiroda";
    final String PASSWORD = "ushiroda";

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

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // ログ出力 Log.d("TAG", "☆　出力LOG");
        // EditText
        EditText editTextId = view.findViewById(R.id.edit_text_user);
        EditText editTextPass = view.findViewById(R.id.edit_text_pass);
        // Button
        Button button = view.findViewById(R.id.login_button);

        // リスナーに設定
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usename = editTextId.getText().toString();
                String password = editTextPass.getText().toString();
                Log.d("TAG", "☆　出力LOG" + usename);
                Log.d("TAG", "☆　出力LOG" + password);

                if (usename.equals(USENAME) && password.equals(PASSWORD)) {
                    Log.d("TAG", "判定OK");
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout_main, new SampleFragment2());
                    transaction.commit();
                }

            }


            // TextView
            // EditText
            // LinearLayout
        });
    }
}