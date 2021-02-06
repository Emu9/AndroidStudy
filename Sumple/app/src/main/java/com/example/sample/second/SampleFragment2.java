package com.example.sample.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sample.R;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Android 勉強会 第二回
 */
public class SampleFragment2 extends Fragment {

    int countNum = 0;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // xml 問題
        // 問1 ボタンを表示してみよう。
        Button button;
        button = view.findViewById(R.id.button2);

        // 問2 文字を表示してみよう。

        //button.setOnClickListener(v -> {
        //    button.setText("test");
        //});
        // java 問題
        // 問1 ボタンを押下してToast(↓)を表示してみよう。
        //Toast.makeText(getContext(), "Android Studio Second Study", Toast.LENGTH_SHORT).show();

        // 問2 ボタンを押下した回数を表示してみよう。

        button.setOnClickListener(v -> {
            TextView textView;
            textView = view.findViewById(R.id.textView);
            textView.setText(String.valueOf(countNum));
            if (countNum == 0){
                countNum ++;
            }else if(countNum % 3 == 0){
                textView.setText("lol");
                countNum ++;
            }else {
                countNum ++;
            }
        });
    }

}
