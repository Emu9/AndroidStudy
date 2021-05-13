package one.example.sample.therd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * 第３回、第４回あたりでやること
 * ▼UIパーツの実装を兼ねてログイン画面とTODOリストの作成
 * ①Button,TextView,EditText,LinearLayoutを使って画面の作成(ログイン画面を想定)
 * ②リスナーの実装(ボタン押下時の判定、画面遷移)
 * ③RecyclerViewの実装(データクラス、Adapterクラス、ViewHolderクラス)
 */
public class TodoFragment extends Fragment {


    public TodoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_todo, container, false);
    }

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        // データ設定
        ArrayList<LoginManagement> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            LoginManagement loginManagement = new LoginManagement();
            loginManagement.setLocalDateTime(LocalDateTime.now());
            loginManagement.setUser("USER" + i);
            arrayList.add(loginManagement);
        }
        CustomAdapter customAdapter = new CustomAdapter(arrayList);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }
}