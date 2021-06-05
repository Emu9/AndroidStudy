package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "★";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //問1
        //q_01(5,2);
        //問2
        //q_02(5,2);
        //問3
        //q_03(5,2);
        //問4
        //q_04(5,5);
        //問5
        //q_05(123);
        //問6
        //q_06(-123);
        //問7
        //q_07(50);
        // 問8
        //q_08(60,60);
        // 問9
        //q_09(2);
        // 問10
        q_10(123);
    }

    public void q_01(int x, int y){
        Log.d(TAG, "問1 start");
        if (x > y){
            Log.d(TAG, "xはyより大きい。");
        }
    }

    public void q_02(int x, int y){
        Log.d(TAG, "問2 start");
        if (x > y){
            Log.d(TAG, String.valueOf(x));
        }else{
            Log.d(TAG, String.valueOf(y));
        }
    }

    public void q_03(int x, int y){
        Log.d(TAG, "問3 start");
        if (x > y){
            Log.d(TAG, "xはyより大きい");
        }else{
            Log.d(TAG, "xはyより小さい");
        }
    }

    public void q_04(int x, int y){
        Log.d(TAG, "問4 start");
        if (x > y){
            Log.d(TAG, "xはyより大きい");
        }else if(x <y){
            Log.d(TAG, "xはyより小さい");
        }else{
            Log.d(TAG, "xとyは等しい");
        }
    }
    public void q_05(int n){
        Log.d(TAG, "問5 start");
        if (n % 2 == 1){
            Log.d(TAG, "奇数ですよ");
        }else{
            Log.d(TAG, "偶数ですよ");
        }
    }
    public void q_06(int n){
        Log.d(TAG, "問6 start 入力値：" + n);
        if (n > 0 ){
            Log.d(TAG, "正の整数");
            if (n % 2 == 1){
                Log.d(TAG, "正の奇数です");
            }else{
                Log.d(TAG, "正の偶数です");
            }
        }else if(n < 0){
            Log.d(TAG, "負の整数");
            if (n % 2 == -1){
                Log.d(TAG, "負の奇数です");
            }else{
                Log.d(TAG, "負の偶数です");
            }
        }else{
            Log.d(TAG, "0またはその他");
        }
    }

    public void q_07(int n){
        Log.d(TAG, "問7 start 入力値：" + n);
        if(n >= 80){ Log.d(TAG, "優"); return; }
        if(n >= 70){ Log.d(TAG, "良"); return; }
        if(n >= 60){ Log.d(TAG, "可"); return; }
        Log.d(TAG, "不可");
    }
    public void q_08(int n1, int n2){
        Log.d(TAG, "問8 start 中間点数：" + n1 + "期末点数：" + n2);
        if(n1 >= 60 && n2 >= 60){
            Log.d(TAG, "合格");
            return;
        }
        if(n1 + n2 >= 130){
            Log.d(TAG, "合格");
            return;
        }
        if(n1 + n2 >= 100 && n1 >= 90 || n2 >= 90){
            Log.d(TAG, "合格");
            return;
        }
        Log.d(TAG, "不合格");
    }

    public void q_09(int n){
        Log.d(TAG, "問9 start 月：" + n);
        switch(n){
            case 1:
                Log.d(TAG, "31");
                break;
            case 2:
                Log.d(TAG, "28");
                break;
            case 3:
                Log.d(TAG, "31");
                break;
            case 4:
                Log.d(TAG, "30");
                break;
            case 5:
                Log.d(TAG, "31");
                break;
            case 6:
                Log.d(TAG, "30");
                break;
            case 7:
                Log.d(TAG, "31");
                break;
            case 8:
                Log.d(TAG, "31");
                break;
            case 9:
                Log.d(TAG, "30");
                break;
            case 10:
                Log.d(TAG, "31");
                break;
            case 11:
                Log.d(TAG, "30");
                break;
            case 12:
                Log.d(TAG, "31");
                break;
        }
    }
    public void q_10(int n){
        Log.d(TAG, "問10 start");
        if (n % 2 == 1){
            Log.d(TAG, "odd");
        }else{
            Log.d(TAG, "even");
        }
    }
}