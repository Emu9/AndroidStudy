package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class PracticeLog  {
    public static void d(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.d("(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")" , msg);
    }
    public static void i(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.i("(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")" , msg);
    }
    public static void e(String msg) {
        StackTraceElement calledClass = Thread.currentThread().getStackTrace()[3];
        Log.e("(" + calledClass.getFileName() + ":"
                + calledClass.getLineNumber() + ")" , msg);
    }
}

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "★";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
}