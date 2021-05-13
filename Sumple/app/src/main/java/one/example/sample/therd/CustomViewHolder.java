package one.example.sample.therd;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

/**
 * 紐づけを行う。
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {
    public TextView mUser;
    public TextView mTime;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        mUser = itemView.findViewById(R.id.row_user_id);
        mTime = itemView.findViewById(R.id.row_login_time);
    }
}
