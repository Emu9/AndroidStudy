package one.example.sample.fourthPlactice;

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

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import one.example.sample.fourthPlactice.base.model.adapter.PracticeAdapter;
import one.example.sample.fourthPlactice.base.model.form.PracticeUserForm;

public class FourthPracticeFragment extends Fragment {

    public FourthPracticeFragment() {
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.practice_recycler_view);

        ArrayList<PracticeUserForm> practiceUserFormArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PracticeUserForm practiceUserForm = new PracticeUserForm();
            practiceUserForm.setName("タスク" + i);
            practiceUserForm.setContent(i + "回実施");
            if (i % 2 == 0) {
                practiceUserForm.setDone("完");
            } else {
                practiceUserForm.setDone("未");
            }
            practiceUserFormArrayList.add(practiceUserForm);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PracticeAdapter practiceAdapter = new PracticeAdapter(practiceUserFormArrayList);
        recyclerView.setAdapter(practiceAdapter);
    }
}
