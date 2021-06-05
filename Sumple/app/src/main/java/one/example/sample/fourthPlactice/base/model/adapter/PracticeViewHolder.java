package one.example.sample.fourthPlactice.base.model.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import org.jetbrains.annotations.NotNull;

public class PracticeViewHolder extends RecyclerView.ViewHolder {

    TextView mTaskName;
    TextView mTaskContent;
    TextView mTaskDone;

    public PracticeViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        mTaskName = itemView.findViewById(R.id.task_name);
        mTaskContent = itemView.findViewById(R.id.task_content);
        mTaskDone = itemView.findViewById(R.id.task_done);
    }
}
