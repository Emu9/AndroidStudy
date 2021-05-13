package one.example.sample.fourthPlactice.base.model.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

public class PracticeViewHolder extends RecyclerView.ViewHolder {

    public TextView mName;
    public TextView mContent;
    public TextView mDone;

    public PracticeViewHolder(@NonNull View itemView) {
        super(itemView);
        mName = itemView.findViewById(R.id.text_name);
        mContent = itemView.findViewById(R.id.text_content);
        mDone = itemView.findViewById(R.id.text_done);
    }
}
