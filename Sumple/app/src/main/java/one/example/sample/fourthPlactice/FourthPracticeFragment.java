package one.example.sample.fourthPlactice;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import java.util.ArrayList;

import one.example.sample.fourthPlactice.base.model.adapter.PracticeAdapter;
import one.example.sample.fourthPlactice.base.model.form.PlacticeUserForm;

public class FourthPracticeFragment extends Fragment {

    public FourthPracticeFragment() {
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
        return inflater.inflate(R.layout.fragment_recycler_view, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.practice_recycler_view);
        ArrayList<PlacticeUserForm> userFormArrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            PlacticeUserForm placticeUserForm = new PlacticeUserForm();
            placticeUserForm.setName("タスク" + i);
            placticeUserForm.setContent(i + "回実施する");
            if (i % 2 == 0) {
                placticeUserForm.setDone("完");
            } else {
                placticeUserForm.setDone("未");
            }
            userFormArrayList.add(placticeUserForm);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        PracticeAdapter practiceAdapter = new PracticeAdapter(userFormArrayList);
        recyclerView.setAdapter(practiceAdapter);

    }
}
