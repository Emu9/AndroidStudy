package com.example.practices;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PracticeLog.d("onCreate");
        test();

        EditText editText = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener((v) -> {
            PracticeLog.d("editText : " + editText.getText());
            textView.setText(practice6(Integer.parseInt(editText.getText().toString())));
        });


    }


    private void test() {
        PracticeLog.d("test");
        PracticeLog.i("test");
        PracticeLog.e("test");
    }

    /**
     * 整変数に格納し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
     * <p>
     * “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
     */
    private String practice6(int number) {

        // 正と負
        if (number >= 0) {
            if (number % 2 == 0) {
                PracticeLog.d("正の偶数");
                return "正の偶数";
            } else {
                PracticeLog.d("正の奇数");
                return "正の奇数";
            }
        } else {
            if (number % 2 == 0) {
                PracticeLog.d("負の偶数");
                return "負の偶数";
            } else {
                PracticeLog.d("負の奇数");
                return "負の奇数";
            }
        }

    }

}