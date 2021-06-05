package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "★";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        compareNumber(1,2);
//        compareNumber(2,1);
//        compareNumber2(1,2);
//        compareNumber2(2,1);
//        compareNumber3(1,2);
//        compareNumber3(2,1);
//        compareNumber4(1,2);
//        compareNumber4(2,1);
//        compareNumber4(2,2);
//        judgmentNumber(1);
//        judgmentNumber(2);
//        judgmentNumber2(-1);
//        judgmentNumber2(-2);
//        judgmentNumber2(1);
//        judgmentNumber2(2);
//        judgmentTestScore(80);
//        judgmentTestScore(79);
//        judgmentTestScore(70);
//        judgmentTestScore(69);
//        judgmentTestScore(60);
//        judgmentTestScore(59);
//        judgmentTestScore2(60,60);
//        judgmentTestScore2(60,59);
//        judgmentTestScore2(50,80);
//        judgmentTestScore2(80,50);
//        judgmentTestScore2(49,80);
//        judgmentTestScore2(79,50);
//        judgmentTestScore2(10,90);
//        judgmentTestScore2(90,10);
//        judgmentTestScore2(9,90);
//        judgmentTestScore2(90,9);
//        showMonthDays(0);
//        showMonthDays(1);
//        showMonthDays(2);
//        showMonthDays(3);
//        showMonthDays(4);
//        showMonthDays(5);
//        showMonthDays(6);
//        showMonthDays(7);
//        showMonthDays(8);
//        showMonthDays(9);
//        showMonthDays(10);
//        showMonthDays(11);
//        showMonthDays(12);
//        showMonthDays(13);

        judgmentNumber3(0);
        judgmentNumber3(1);
        judgmentNumber3(2);
    }

    /**
     * 1	"int 型の変数 x、y にそれぞれ変数を格納し、x が y より大きい場合に、“xはyより大きい。”
     * という文を表示するプログラムを作成しなさい。"
     * @param x
     * @param y
     */
    public void compareNumber(int x, int y){
        if(x > y){
            Log.d(TAG,"xはyより大きい。");
        }
    }

    /**
     * 2	"２つの整数値を変数に格納し、
     * 大きい方（小さくない方）の数を表示するプログラムを作成しなさい。"
     * @param x
     * @param y
     */

    public void compareNumber2(int x, int y){
        if(x > y){
            Log.d(TAG, String.valueOf(x));
        }
        else{
            Log.d(TAG,String.valueOf(y));
        }
    }

    /**
     * 3	"int 型の変数 x、y にそれぞれ変数に格納し、
     * x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。"
     * @param x
     * @param y
     */
    public void compareNumber3(int x, int y){
        if(x > y){
            Log.d(TAG,"xはyより大きい。");
        }
        else{
            Log.d(TAG,"xはyより小さい。");
        }
    }

    /**
     * 4	"int 型の変数 x、y にそれぞれ数値を格納し、x がｙより大きい場合には“xはyより大きい”、
     * x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。"
     * @param x
     * @param y
     */
    public void compareNumber4(int x, int y){
        if(x > y){
            Log.d(TAG,"xはyより大きい。");
        }
        else if (y > x){
            Log.d(TAG,"xはyより小さい。");
        }
        else{
            Log.d(TAG,"xとyは等しい。");
        }
    }

    /**
     * 5	数字を変数に格納し、それが偶数か奇数かを判定するプログラムを作成しなさい。
     * @param x
     */
    public void judgmentNumber(int x){
        if(x % 2 == 0){
            Log.d(TAG,"偶数");
        } else{
            Log.d(TAG,"奇数");
        }
    }

    /**
     * 6	"整変数に格納し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
     * “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”"
     * @param x
     */
    public void judgmentNumber2(int x){
        if(x % 2 == 0 && 0 <= x){
            Log.d(TAG,"正の偶数");
        } else if(x % 2 == 0 && 0 > x){
            Log.d(TAG,"負の偶数");
        } else if(x % 2 != 0 && 0 <= x){
            Log.d(TAG,"正の奇数");
        } else{
            Log.d(TAG,"負の奇数");
        }
    }

    /**
     * 7	"試験の点数を変数にハードコーディングし、
     * 対応する成績を表示するプログラムを作成しなさい。
     *
     * 試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
     *
     *     80 点以上：“優”
     *     70 点以上、80 点未満：“良”
     *     60 点以上、70 点未満：“可”
     *     60 点未満：“不可”"
     * @param x
     */
    public void judgmentTestScore(int x){
        if(x >= 80){
            Log.d(TAG,"優");
        } else if(x >= 70){
            Log.d(TAG,"良");
        } else if(x >= 60){
            Log.d(TAG,"可");
        } else{
            Log.d(TAG,"不可");
        }
    }

    /**
     * 8	"中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を変数にハードコーディングし、
     * 次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
     *
     * 両方とも 60 点以上の場合、合格
     * 合計が 130 点以上の場合、合格
     * 合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
     * 上記以外は不合格"
     * @param midScore
     * @param finalScore
     */
    public void judgmentTestScore2(int midScore, int finalScore){
        String passing = "合格";
        if(midScore >= 60 && finalScore >= 60){
            Log.d(TAG,passing);
        } else if(midScore + finalScore >= 130){
            Log.d(TAG,passing);
        } else if(midScore + finalScore >= 100 && (midScore >= 90 || finalScore >= 90) ){
            Log.d(TAG,passing);
        } else{
            Log.d(TAG,"不"+ passing);
        }
    }

    /**
     * 9	"月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
     *
     * また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。"
     * @param Month
     */
    public void showMonthDays(int Month){
        if(Month <= 0 || Month > 12){
            Log.d(TAG,"入力が間違っています");
        }
        else if(Month == 2){
            Log.d(TAG,"28");
        }
        else {
            YearMonth yearMonthObject = YearMonth.of(2021, Month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            Log.d(TAG, String.valueOf(daysInMonth));
        }
    }

    /**
     * 10	整数値を入力させ、その値が偶数ならばeven、奇数ならばoddと表示するプログラムを作成せよ。
     * @param x
     */
    public void judgmentNumber3(int x){
        if(x % 2 == 0){
            Log.d(TAG,"even");
        } else{
            Log.d(TAG,"odd");
        }
    }
}