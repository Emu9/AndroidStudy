package com.example.sample.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sample.R;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Android 勉強会 第二回
 */
public class SampleFragment2 extends Fragment {

    //Button押下回数をカウントする変数
    int n = 0;

    //

    // onCreateViewメソッドで、レイアウトを選択する
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    // 処理を記述する
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // xml 問題
        // 問1 ボタンを表示してみよう。
        Button button = view.findViewById(R.id.button);

        TextView push_count = view.findViewById(R.id.msgPushButtonCount);
        push_count.setText(String.valueOf(n));

        ImageView nabeatsu = view.findViewById(R.id.nabeatsu);



        // 問2 文字を表示してみよう。
        //button.setOnClickListener(v -> {
        //    //button.setText("TEST");
        //});

        // java 問題
        // 問2 ボタンを押下した回数を表示してみよう。
        button.setOnClickListener(v -> {
            n++;
            push_count.setText(String.valueOf(n));

            if(n%3 == 0){
                nabeatsu.setVisibility(View.VISIBLE);
            }else{
                nabeatsu.setVisibility(View.INVISIBLE);
            }
        });


    }

}
