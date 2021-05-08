package com.example.sample.fourth.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;
import com.example.sample.fourth.model.form.UserForm;

import java.util.ArrayList;

// ViewHolderを継承する
public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {

    private ArrayList<UserForm> mList;

    //コンストラクタ
    public TodoAdapter(ArrayList<UserForm> list) {
        mList = list;
    }

    /**
     * Adapterが持っているメソッド（必ずoverrideしなければいけないメソッド）[1/3]
     * 固定なのでコピペで大丈夫
     */
    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_todo_item, parent, false);
        return new TodoViewHolder(view);
    }

    /**
     * Adapterが持っているメソッド（必ずoverrideしなければいけないメソッド）[2/3]
     *
     * @param holder
     * @param position リストの位置
     */
    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        //mListの中からUserFormを取得
        UserForm userForm = mList.get(position);

        // データを取得
        String name = userForm.getName();
        holder.mTaskName.setText(name);

        String content = userForm.getContent();
        holder.mTaskContent.setText(content);

        String done = userForm.getDone();
        holder.mTaskDone.setText(done);
    }

    /**
     * Adapterが持っているメソッド（必ずoverrideしなければいけないメソッド）[3/3]
     * リストの数を返却する
     * ここで返却した数の分だけリストを作成
     *
     * @return リストの数
     */
    @Override
    public int getItemCount() {
        // mListの配列の数
        return mList.size();
    }
}
