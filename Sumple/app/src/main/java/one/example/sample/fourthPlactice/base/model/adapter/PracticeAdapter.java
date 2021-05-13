package one.example.sample.fourthPlactice.base.model.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sample.R;

import java.util.ArrayList;

import one.example.sample.fourthPlactice.base.model.form.PlacticeUserForm;

public class PracticeAdapter extends RecyclerView.Adapter<PracticeViewHolder> {

    private ArrayList<PlacticeUserForm> mUserFormArrayList;

    public PracticeAdapter(ArrayList<PlacticeUserForm> mUserFormArrayList) {
        this.mUserFormArrayList = mUserFormArrayList;
    }


    @NonNull
    @Override
    public PracticeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view_row_item, parent, false);
        return new PracticeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PracticeViewHolder holder, int position) {
        PlacticeUserForm placticeUserForm = mUserFormArrayList.get(position);

        String name = placticeUserForm.getName();
        holder.mName.setText(name);

        String content = placticeUserForm.getContent();
        holder.mContent.setText(content);

        String done = placticeUserForm.getDone();
        holder.mDone.setText(done);

    }

    @Override
    public int getItemCount() {
        return mUserFormArrayList.size();
    }
}
