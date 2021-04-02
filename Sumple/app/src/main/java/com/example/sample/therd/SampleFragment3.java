package com.example.sample.therd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sample3, container, false);
    }

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // Button
        // TextView
        // EditText
        // LinearLayout
    }
}