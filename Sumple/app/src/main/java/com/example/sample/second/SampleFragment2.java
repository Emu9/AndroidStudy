package com.example.sample.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.sample.R;

/**
 * Android 勉強会 第二回
 */
public class SampleFragment2 extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // xml 問題
        // 問1 ボタンを表示してみよう。

        // 問2 文字を表示してみよう。

        // java 問題
        // 問1 ボタンを押下してToast(↓)を表示してみよう。
        Toast.makeText(getContext(), "Android Studio Second Study", Toast.LENGTH_SHORT).show();

        // 問2 ボタンを押下した回数を表示してみよう。

    }

}
