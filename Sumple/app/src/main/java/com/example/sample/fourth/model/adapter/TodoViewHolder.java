package com.example.sample.fourth.model.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

// データの参照を保持する
public class TodoViewHolder extends RecyclerView.ViewHolder {

    // メンバ変数(メソッドの外の定義されている変数)を宣言
    // アンドロイドでは先頭にmをつける
    public TextView mTaskName;
    public TextView mTaskContent;
    public TextView mTaskDone;

    public TodoViewHolder(@NonNull View itemView) {
        super(itemView);
        // 参照先を取得
        mTaskName = itemView.findViewById(R.id.task_name);
        mTaskContent = itemView.findViewById(R.id.task_content);
        mTaskDone = itemView.findViewById(R.id.task_done);
    }
}