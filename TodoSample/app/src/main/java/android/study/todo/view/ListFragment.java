package android.study.todo.view;

import android.os.Bundle;
import android.study.todo.R;
import android.study.todo.model.adapter.TodoAdapter;
import android.study.todo.model.data.TodoData;
import android.study.todo.model.log.ExpansionLog;
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
        for (int i = 0; i <= 5; i++) {
            TodoData data = new TodoData();
            data.setDeadlineTime("期日 : " + i);
            data.setTitle("タイトル : " + i);
            data.setTitle("内容 : " + i);
            dataList.add(data);
        }

        TodoAdapter adapter = new TodoAdapter(dataList);
        recyclerView.setAdapter(adapter);
        ExpansionLog.d("End");

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.add_button) {
            ExpansionLog.d("ボタン押下");
            // ダイアログ出力
        } else if (itemId == R.id.search_button) {
            ExpansionLog.d("ボタン押下");
        } else {
            return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

}
