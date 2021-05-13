package one.example.sample.therd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private ArrayList<LoginManagement> mArrayList;

    /**
     * コンストラクタでリストを持ってくる。
     */
    public CustomAdapter(ArrayList<LoginManagement> list) {
        mArrayList = list;
    }

    /**
     * 生成するlayoutを設定する。
     * 紐づけはviewHolder側で行う。
     */
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.text_row_item, parent, false);
        return new CustomViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.mUser.setText(mArrayList.get(position).getUser());
        holder.mTime.setText(mArrayList.get(position).getLocalDateTime().toString());
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
