package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "★";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(v -> {

        });
        number1(1,0);
        number2(1,0);
        number3(-1,0);
        number4(0,0);
        number5(0);
        number6(-1);
        number7(59);
        number8(80,80);
        number9(1-1); //0始まりのためマイナス1
        number10(2);
        number11();
        number12();
        number13(10);
        number14(6);
        number15(1,2);
        number16();
        number17(2520);
        number18();
        number19();
        number20();
    }

    public void number1(int x,int y){
        if(x > y) {
            Log.d(TAG, "xはyより大きい");
        }
    }

    public void number2(int x,int y){
        if(x > y) {
            Log.d(TAG, String.valueOf(x));
        }
        else{
            Log.d(TAG, String.valueOf(y));
        }
    }

    public void number3(int x ,int y){
        if(x > y){
            Log.d(TAG,"xがyより大きい");
        }
        else{
            Log.d(TAG, "xがyより小さい");
        }
    }

    public void number4(int x ,int y){
        if(x > y){
            Log.d(TAG,"xがyより大きい");
        }
        else if(x < y){
            Log.d(TAG, "xがyより小さい");
        }
        else{
           Log.d(TAG, "xとyは等しい");
        }
    }

    public void number5(int x){
        if(x % 2 == 0){
            Log.d(TAG, "xは偶数");
        }
        else{
            Log.d(TAG, "xは奇数");
        }
    }

    public void number6(int x){
        if(x >= 0){
            if(x % 2 == 0){
                Log.d(TAG, "正の偶数");
            }
            else{
                Log.d(TAG, "正の奇数");
            }
        }
        if (x < 0) {
            if (x % 2 == 0) {
                Log.d(TAG, "負の偶数");
            } else {
                Log.d(TAG, "負の奇数");
            }
        }
    }

    public void number7(int score){
        if(score >= 80){
            Log.d(TAG, "優");
        }
        else if (score >= 70 && 80 > score){
            Log.d(TAG, "良");
        }
        else if (score >= 60 && 70 > score){
            Log.d(TAG, "可");
        }
        else if (score < 60){
            Log.d(TAG, "不可");
        }
    }

    public void number8(int midterm_test,int end_of_test){
        int score_sum = midterm_test + end_of_test;
        boolean is_clear = Judge_clear(midterm_test, end_of_test, score_sum);
        if(is_clear == true){
            Log.d(TAG,"合格");
        }
        else {
            Log.d(TAG,"不合格");
        }
    }
    //問８メソッド
    public boolean Judge_clear(int mid_score, int end_score, int score_sum){
        if(mid_score >= 60 && end_score >= 60){
            return true;
        }
        if(score_sum >= 130){
            return true;
        }
        if(score_sum >= 100 && (mid_score >= 90 || end_score >= 90)){
            return true;
        }
        return false;
    }
    /*--------------------------------------*/

    public void number9(int month){
        switch (month){
            case 0:
                catch_max_day(month);
            case 1:
                catch_max_day(month);
                break;
            case 2:
                catch_max_day(month);
                break;
            case 3:
                catch_max_day(month);
                break;
            case 4:
                catch_max_day(month);
                break;
            case 5:
                catch_max_day(month);
                break;
            case 6:
                catch_max_day(month);
                break;
            case 7:
                catch_max_day(month);
                break;
            case 8:
                catch_max_day(month);
                break;
            case 9:
                catch_max_day(month);
                break;
            case 10:
                catch_max_day(month);
                break;
            case 11:
                catch_max_day(month);
                break;
            default:
                Log.d(TAG,"入力が間違っています");
        }
    }

    public void catch_max_day(int month){
        Calendar c = new GregorianCalendar(2021,month,1);
        int days = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        Log.d(TAG, String.valueOf(days));
    }
    /*--------------------------------*/

    public void number10(int x){
        if(x % 2 == 0){
            Log.d(TAG,"even");
        }
        else{
            Log.d(TAG,"odd");
        }
    }

    public void number11(){
        for(int i = 1; i < 11; i++){
            Log.d(TAG, String.valueOf(i));
        }
    }

    public void number12(){
        for(int x = 1; x < 10; x++){
            for(int y = 1; y < 10; y++){
                Log.d(TAG, String.valueOf(x*y));
            }
        }
    }

    public void number13(int x){
        if((x % 10 == 0 && x != 10) || x <= 0){
            Log.d(TAG,"xは一桁の自然数");
        }
        else{
            Log.d(TAG,"xは一桁の自然数でない");
        }
    }

    public void number14(int visitors){
        int fee = 600;
        if(visitors >= 20){
            fee = 500;
        }
        else if(visitors >= 5){
            fee = 550;
        }
        int sum = fee * visitors;
        Log.d(TAG, String.valueOf(sum));
    }

    public void number15(int x, int y){
        Log.d(TAG,"入れ替え前の順番は" + x + "," + y);
        int a = x;
        x = y;
        y = a;
        Log.d(TAG,"入れ替え後の順番は" + x + "," + y);
    }

    public void number16(){
        for(int i = 1; i < 101; i++){
            if(i % 3 ==0 && i % 5 ==0){
                Log.d(TAG,"foobar");
            }
            else if(i % 3 == 0){
                Log.d(TAG, "foo");
            }
            else if(i % 5 == 0){
                Log.d(TAG,"bar");
            }
            else{
                Log.d(TAG, String.valueOf(i));
            }
        }
    }

    public void number17(int x){
        String result = "";
        while(true){
            if(x < 2){
                Log.d(TAG, result);
                break;
            }
            for(int i = 2; i <= x;){
                if(x % i == 0){
                    result += String.valueOf(i);
                    if(x != i){
                        result += " * ";
                    }
                    x /= i;
                }
                else{
                    i++;
                }
            }
        }
    }

    public void number18(){
        ArrayList<String> lists = new ArrayList<>();
        lists.add("ハンバーガー");
        lists.add("チーズバーガー");
        lists.add("ダブルチーズバーガー");
        for (String list: lists){
            Log.d(TAG, list);
        }
    }

    public void number19(){
        //HashMapインスタンスを生成
        Map<String, Integer> map = new HashMap<>();
        //各科目の科目名と得点を要素として追加
        map.put("国語",90);
        map.put("数学",80);
        map.put("英語",70);
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            Log.d(TAG, "Key:" + entry.getKey() + " Value:" + entry.getValue());
        }
    }

    static public void number20() {
        List<String> helloWorld = new ArrayList<String>(3);
        helloWorld.add("Hello");
        helloWorld.add(" ");
        helloWorld.add("World");
        helloWorld.add("!");
        helloWorld.forEach(s -> Log.d(TAG, s));
    }
}