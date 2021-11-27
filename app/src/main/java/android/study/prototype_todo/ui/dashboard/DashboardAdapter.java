package android.study.prototype_todo.ui.dashboard;

import android.study.prototype_todo.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.MainViewHolder> {

    private List<RowData> mRowData;

    DashboardAdapter(List<RowData> rowData) {
        mRowData = rowData;
    }


    /**
     * ViewHolder作るメソッド
     * 最初しか呼ばれない。
     * ここでViewHolderのlayoutファイルをインフレートして生成したViewHolderをRecyclerViewに返す。
     */
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MainViewHolder(view);
    }

    /**
     * ViewHolderとRecyclerViewをバインドする
     * 一行のViewに対して共通でやりたい処理をここで書く。
     */
    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        RowData rowData = this.mRowData.get(position);
        holder.mTextView.setText(rowData.getTitle());
        holder.mTextView1.setText(rowData.getContents());
    }

    /**
     * リストの行数
     */
    @Override
    public int getItemCount() {
        return mRowData.size();
    }

    /**
     * アイテムの追加
     */
    public void addItem(RowData rowData) {
        mRowData.add(rowData);
    }


    /**
     * 一行分のデータ
     */
    static class MainViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;
        TextView mTextView1;

        MainViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.title_text_view);
            mTextView1 = itemView.findViewById(R.id.contents_text_view);
        }
    }
}
