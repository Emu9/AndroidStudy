package android.study.todo.model.adapter;

import android.study.todo.R;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TodoViewHolder extends RecyclerView.ViewHolder {

    public TextView mTime;
    public TextView mTitle;
    public TextView mText;


    public TodoViewHolder(@NonNull View itemView) {
        super(itemView);
        mTime = itemView.findViewById(R.id.text_view_time);
        mTitle = itemView.findViewById(R.id.text_view_title);
        mText = itemView.findViewById(R.id.text_view_text);
    }
}
