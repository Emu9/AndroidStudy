package android.study.prototype_todo.ui.dashboard;

import android.os.Bundle;
import android.study.prototype_todo.R;
import android.study.prototype_todo.utility.ExpansionLog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private RecyclerView mRecyclerView;
    private DashboardAdapter mAdapter;

    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            dashboardViewModel.createRowData();
        }
    };

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ExpansionLog.d("Start");


        mRecyclerView = view.findViewById(R.id.dashboard_recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(requireContext());
        mRecyclerView.setLayoutManager(layoutManager);
        mAdapter = new DashboardAdapter(new ArrayList<>());
        mRecyclerView.setAdapter(mAdapter);

        FloatingActionButton floatingActionButton = view.findViewById(R.id.dashboard_fab);
        floatingActionButton.setOnClickListener(mOnClickListener);

        observeStart();
        ExpansionLog.d("End");
    }

    /**
     * LiveDataを用いた画面処理
     */
    private void observeStart() {
        // 変数が変更されたことを自動的に受け取って、画面に描画させる。
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), s -> {
            // 画面更新処理
            ExpansionLog.d("★ テキスト更新 : " + s);
        });
        dashboardViewModel.getRowData().observe(getViewLifecycleOwner(), rowData -> {
            if (rowData.getTitle() == null) return;
            // 画面更新処理
            ExpansionLog.d("★ リスト更新");
            mAdapter.addItem(rowData);
            mRecyclerView.getAdapter().notifyDataSetChanged();
        });
    }
}