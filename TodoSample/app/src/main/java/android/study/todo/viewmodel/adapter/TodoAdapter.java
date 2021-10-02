package android.study.todo.viewmodel.adapter;

import android.study.todo.R;
import android.study.todo.model.data.TodoData;
import android.study.todo.model.utility.MyContext;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * Adapterはリストを保持し、<br>
 * RecyclerViewに対して設定します。<br>
 * setAdapter()を実行することで初めて画面に描画されます。
 * <p>
 * ※将来的にはもっと便利なAdapterの書き方を提示するので、ここはそこまで覚えなくて大丈夫です。
 */
public class TodoAdapter extends RecyclerView.Adapter<TodoViewHolder> {

    private final ArrayList<TodoData> mArrayList;

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

        // 時間の設定
        String time = TodoData.getDeadlineTime();
        holder.mTime.setText(time);

        // タイトルの設定
        String title = TodoData.getTitle();
        holder.mTitle.setText(String.valueOf(title));

        // 本文の設定
        String text = TodoData.getText();
        // String.valueOf()は、nullの場合nullを文字として表示します。text.toString()は、nullの場合ぬるぽ吐いて落ちるので注意。
        holder.mText.setText(String.valueOf(text));

        // Todo ボタンの状態制御

        // 完了済みボタン押下時の処理
        holder.mFinishButton.setOnClickListener(v -> {
            // Todo　とりあえずボタンの背景色を変えて押下したことがわかるようにしています。が、制御処理入っていないんでスクロールでバグります。
            v.setBackgroundColor(MyContext.getContext().getColor(R.color.colorAccent));
        });

    }

    public void addItem(TodoData todoData) {
        mArrayList.add(todoData);
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
