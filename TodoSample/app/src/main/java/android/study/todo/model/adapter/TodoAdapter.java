package android.study.todo.model.adapter;

import android.study.todo.R;
import android.study.todo.model.data.TodoData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {

    private ArrayList<TodoData> mArrayList;

    /**
     * コンストラクタでリストを持ってくる。
     */
    public TodoAdapter(ArrayList<TodoData> list) {
        mArrayList = list;
    }

    /**
     * 生成するlayoutを設定する。
     * 紐づけはviewHolder側で行う。
     */
    @NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new TodoViewHolder(view);
    }


    /**
     * 値を設定したり、リスナーを設定する。
     */
    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
        TodoData TodoData = mArrayList.get(position);

        String time = TodoData.getDeadlineTime();
        holder.mTime.setText(time);

        String title = TodoData.getTitle();
        holder.mTitle.setText(String.valueOf(title));

        String text = TodoData.getText();
        holder.mText.setText(String.valueOf(text));

    }


    /**
     * リストの数を返却する。<br>
     * ここで返却した数の分だけリストを生成する。
     */
    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
}
