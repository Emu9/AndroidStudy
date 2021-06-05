package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Practice practice = new Practice();
        practice.practice1(2,1);
        practice.practice2(3,4);
        practice.practice3(5,6);
        practice.practice4(7,8);
        practice.practice5(9);
        practice.practice6(10);
        practice.practice7();
        practice.practice8();
        practice.practice9(11);
        practice.practice10(12);
    }
}