package android.study.prototype_todo.ui.home;

import android.os.Bundle;
import android.study.prototype_todo.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

/**
 * このFragmentは起動時に表示されるFragmentになります。
 * この画面を充実させつつ、学習を進めましょう。
 * 目的<br>
 * ・xmlを修正して画面を作成できるようになること
 * ・JavaにViewロジックを記載できるようになること
 * <p>
 * xml編
 * 問1 TextView を作成しましょう。
 * 問2 EditText を作成しましょう。
 * 問3 Button を作成しましょう。
 * 問4 縦2列 ↑TextView ↓EditText を作成しましょう。
 * 問5 横3列 Button Button Button をボタンの大きさを均等に作成しましょう。
 * 問6 自由にToDo項目の入力画面を作成しましょう。必須項目 : タイトル,内容,確定ボタン,キャンセルボタン
 * 問ex ※ここはやらなくても良いです。
 * 画面右下にFloatingActionButtonを作成しましょう。
 * <p>
 * <p>
 * Viewロジック
 * 問1 TextView Fragment開始時に文字を設定しましょう。
 * 問2 EditText Fragment開始時にエラー設定してみましょう。
 * 問3 Button Fragment開始時にonClickListenerを設定してみましょう。
 * 問ex ※ここはやらなくても良いです。
 * EditText Fragment開始時にaddTextChangedListenerを設定してみましょう。
 * 問4 Button 押下時にTextViewの文字を変更してみましょう。
 * 問5 Button 押下時にEditTextのエラー表示を解除してみましょう。
 * 問6 Button 押下時にもう片方のボタンを表示/非表示と切り替え出来るようにしてみましょう。
 * <p>
 */
public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
