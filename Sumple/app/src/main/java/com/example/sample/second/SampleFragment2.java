package com.example.sample.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sample.R;

/**
 * Android 勉強会 第二回
 */
public class SampleFragment2 extends Fragment {
    int mNumber = 0;

    // レイアウト
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // xml 問題
        // 問1 ボタンを表示してみよう。
        Button button = view.findViewById(R.id.button2);

        // 問2 文字を表示してみよう。
        // button.setOnClickListener(v -> button.setText("test"));


        // 問2 ボタンを押下した回数を表示してみよう。
        TextView textView = view.findViewById(R.id.text);

        // ボタンを押下時の処理
        button.setOnClickListener(v -> {
            // インクリメント
            mNumber++;
            // 表示を更新
            if (mNumber % 3 == 0) {
                textView.setText("AHO");
            } else {
                textView.setText(String.valueOf(mNumber));
            }
        });

        // 復習問題
        // ボタンを押下したときにボタンの名前を変えてみよう。
        // サンプル
        Button button3 = view.findViewById(R.id.button3);
        String textSetNameSample = getContext().getResources().getString(R.string.sample_set_text);
        button3.setText(textSetNameSample);

    }

}
