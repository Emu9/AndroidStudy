package one.example.sample.fourth.model.adapter;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import java.util.ArrayList;

import one.example.sample.fourth.model.form.UserForm;

public class MatchingAdapter extends RecyclerView.Adapter<MatchingViewHolder> {

    private ArrayList<UserForm> mArrayList;

    /**
     * コンストラクタでリストを持ってくる。
     */
    public MatchingAdapter(ArrayList<UserForm> list) {
        mArrayList = list;
    }

    /**
     * 生成するlayoutを設定する。
     * 紐づけはviewHolder側で行う。
     */
    @NonNull
    @Override
    public MatchingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sample, parent, false);
        return new MatchingViewHolder(view);
    }


    /**
     * 値を設定したり、リスナーを設定する。
     */
    @Override
    public void onBindViewHolder(@NonNull MatchingViewHolder holder, int position) {
        String name = mArrayList.get(position).getName();
        holder.mUserName.setText(name);

        String age = mArrayList.get(position).getAge();
        holder.mAge.setText(age);

        Bitmap bitmap = mArrayList.get(position).getIcon();
        holder.mImageView.setImageBitmap(bitmap);
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
