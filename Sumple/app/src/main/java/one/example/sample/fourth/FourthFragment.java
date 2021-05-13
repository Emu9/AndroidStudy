package one.example.sample.fourth;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
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

import java.util.ArrayList;
import java.util.List;

import one.example.sample.common.animation.SwipeHelper;
import one.example.sample.fourth.base.model.adapter.MatchingAdapter;
import one.example.sample.fourth.base.model.form.UserForm;

public class FourthFragment extends Fragment {

    public FourthFragment() {
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
        return inflater.inflate(R.layout.fragment_sample4, container, false);
    }

    // 処理
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        // データの生成
        ArrayList<UserForm> userFormArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserForm userForm = new UserForm();
            userForm.setAge(i + 18 + "歳");
            userForm.setName(i + "郎");
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.sample);
            userForm.setIcon(bitmap); // Todo 設定する画像を用意するのが手間なので固定
            userFormArrayList.add(userForm);
        }

        // レイアウトの設定
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Adapterの生成
        MatchingAdapter matchingAdapter = new MatchingAdapter(userFormArrayList);

        // Adapterの設定
        recyclerView.setAdapter(matchingAdapter);


        // スワイプの追加
        SwipeHelper swipeHelper = new SwipeHelper(getContext(), recyclerView) {
            @Override
            public void instantiateUnderlayButton(RecyclerView.ViewHolder viewHolder, List<UnderlayButton> underlayButtons) {
                underlayButtons.add(new SwipeHelper.UnderlayButton(
                        "Delete",
                        0,
                        Color.parseColor("#FF3C30"),
                        new SwipeHelper.UnderlayButtonClickListener() {
                            @Override
                            public void onClick(int pos) {
                                // TODO: onDelete
                            }
                        }
                ));
            }
        };
        swipeHelper.attachSwipe();
    }
}
