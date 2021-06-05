package one.example.sample.fourthPlactice.base.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import java.util.ArrayList;

import one.example.sample.fourthPlactice.base.model.form.PracticeUserForm;

public class PracticeAdapter extends RecyclerView.Adapter<PracticeViewHolder> {

    ArrayList<PracticeUserForm> mPracticeUserFormArrayList;

    public PracticeAdapter(ArrayList<PracticeUserForm> mPracticeUserFormArrayList) {
        this.mPracticeUserFormArrayList = mPracticeUserFormArrayList;
    }

    @NonNull
    @Override
    public PracticeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view_row_item, parent, false);
        return new PracticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PracticeViewHolder holder, int position) {
        PracticeUserForm practiceUserForm = mPracticeUserFormArrayList.get(position);

        String name = practiceUserForm.getName();
        holder.mTaskName.setText(name);

        String content = practiceUserForm.getContent();
        holder.mTaskContent.setText(content);

        String done = practiceUserForm.getDone();
        holder.mTaskDone.setText(done);
    }

    @Override
    public int getItemCount() {
        return mPracticeUserFormArrayList.size();
    }
}
