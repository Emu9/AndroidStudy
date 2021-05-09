package one.example.sample.fourth.base.model.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

public class MatchingViewHolder extends RecyclerView.ViewHolder {

    public ImageView mImageView;
    public TextView mUserName;
    public TextView mAge;


    public MatchingViewHolder(@NonNull View itemView) {
        super(itemView);
        mImageView = itemView.findViewById(R.id.image_face);
        mUserName = itemView.findViewById(R.id.text_name);
        mAge = itemView.findViewById(R.id.text_age);
    }
}
