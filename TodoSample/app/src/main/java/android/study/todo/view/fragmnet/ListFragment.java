package android.study.todo.view.fragmnet;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.study.todo.R;
import android.study.todo.model.data.TodoData;
import android.study.todo.model.utility.ExpansionLog;
import android.study.todo.viewmodel.adapter.TodoAdapter;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    /**
     * Adapter
     */
    private TodoAdapter mAdapter;

    public ListFragment() {
        // Do Nothing ..
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ツールバーの有効化
        setHasOptionsMenu(true);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ExpansionLog.d("Start");

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        // LayoutManagerの設定 デフォルトで縦方向
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext());
        recyclerView.setLayoutManager(layoutManager);
        // Stub Todo キャッシュとかJsonとか外部ファイルやDBから読み込み
        ArrayList<TodoData> dataList = new ArrayList<>();
        //  for (int i = 0; i <= 20; i++) {
        //      TodoData data = new TodoData();
        //      data.setDeadlineTime("期日 : " + i);
        //      data.setTitle("タイトル : " + i);
        //      data.setTitle("内容 : " + i);
        //      dataList.add(data);
        //  }

        mAdapter = new TodoAdapter(dataList);
        recyclerView.setAdapter(mAdapter);
        ExpansionLog.d("End");

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        ExpansionLog.d("ボタン押下");
        int id = item.getItemId();
        if (id == R.id.add_button) {
            // Todo データの追加 ここに渡すデータを変更することで、任意のデータを追加できます。
            TodoData todoData = new TodoData();

            mAdapter.addItem(todoData);


            // 画面の更新
            mAdapter.notifyDataSetChanged();
        } else if (id == R.id.search_button) {
            // Todo 検索処理
        }
        return super.onOptionsItemSelected(item);
    }

}
