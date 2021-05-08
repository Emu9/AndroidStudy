package com.example.sample.fourth.model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;
import com.example.sample.fourth.model.adapter.TodoAdapter;
import com.example.sample.fourth.model.form.UserForm;

import java.util.ArrayList;

public class ForthFragment extends Fragment {

    public ForthFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    //画面の生成
    //コピペでOK（R.layout.??????の中身だけ変更）
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo_app, container, false);
    }

    //fragment_todo_appの中のRecyclerViewの変数を用意
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.my_recycler_view);
        // データの生成
        ArrayList<UserForm> userFormArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserForm userForm = new UserForm();
            userForm.setName(i + "郎");
            userForm.setContent(i + "回実行");
            if (i % 2 == 0) {
                userForm.setDone("完");
            } else {
                userForm.setDone("未完");
            }
            userFormArrayList.add(userForm);
        }
        TodoAdapter todoAdapter = new TodoAdapter(userFormArrayList);
        recyclerView.setAdapter(todoAdapter);
    }
}
