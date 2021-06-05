package com.example.practices;

import android.util.Log;

import java.util.Calendar;

public class Practice {

  public void practice1(int x, int y){
    if(x > y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice1 Result");
      PracticeLog.d("xはyより大きい");
    }
  }

  public void practice2(int x, int y){
    if (x > y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice2 Result");
      PracticeLog.d(String.valueOf(x));
      return;
    }
    if (y > x){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice2 Result");
      PracticeLog.d(String.valueOf(y));
    }
  }

  public  void  practice3(int x, int y){
    if (x > y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice3 Result");
      PracticeLog.d("xはyより大きい");
      return;
    }
    if (x < y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice3 Result");
      PracticeLog.d("xはyより小さい");
    }
  }

  public void  practice4(int x, int y){
    if (x > y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice4 Result");
      PracticeLog.d("xはyより大きい");
      return;
    }
    if (x < y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice4 Result");
      PracticeLog.d("xはyより小さい");
      return;
    }
    if (x == y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice4 Result");
      PracticeLog.d("xとyは等しい");
    }
  }

  public  void  practice5(int num){
    String msg = "奇数";
    if (num % 2==0){
      msg = "偶数";
    }
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice5 Result");
    PracticeLog.d(msg);
  }

  public void practice6(int num){
    String plusAndMinus;
    if (num > 0){
      plusAndMinus = "正";
    }else{
      plusAndMinus = "負";
    }
    String evenAndOdd;
    if (num % 2 == 0){
      evenAndOdd = "偶数";
    }else{
      evenAndOdd = "奇数";
    }
    String msg = "引数numは{0}の{1}です";
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice6 Result");
    PracticeLog.d(String.format(msg, plusAndMinus,evenAndOdd));
  }

  public void practice7(){
    int score = 80;
    String msg = "不可";
    if (score >= 80){
      msg = "優";
    }
    if (score >= 70){
      msg = "良";
    }
    if (score >= 60){
      msg = "可";
    }
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice7 Result");
    PracticeLog.d(msg);
  }

  public void practice8(){
    int midTermExam = 80;
    int finalExam = 60;
    String msg = "不合格";
    if ((midTermExam >= 60) && (finalExam >= 60)){
      msg = "合格";
    }
    if (midTermExam + finalExam >= 130){
      msg = "合格";
    }
    if (midTermExam + finalExam >= 100){
      if (midTermExam >= 90){
        msg = "合格";
      }
      if (finalExam >= 90){
        msg = "合格";
      }
    }
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice8 Result");
    PracticeLog.d(msg);
  }

  public  void  practice9(int month){
    if ((month < 0) || (month > 12)){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice9 Result");
      PracticeLog.d("入力が間違っています");
      return;
    }
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR,2021);
    calendar.set(Calendar.MONTH,month);
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice9 Result");
    PracticeLog.d(String.valueOf(calendar.getActualMaximum(Calendar.DAY_OF_MONTH)));
  }

  public void practice10(int num){
    String msg = "odd";
    if ((num % 2) ==0){
      msg = "even";
    }
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice10 Result");
    PracticeLog.d(msg);
  }

  public void practice11(int cnt){
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice10 Result");
    if (cnt < 0){
      PracticeLog.d("不正な値です");
      return;
    }
    for (int loopCnt=0;loopCnt<cnt;loopCnt++){
      for (int i=1;i<11;i++){
        PracticeLog.d(String.valueOf(i));
      }
    }
  }

  public void practice12(){
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice11 Result");
    for (int i=1;i<10;i++){
      for (int j=1;j<10;j++){
        PracticeLog.d(String.valueOf(i*j));
      }
    }
  }

  public void practice13(int num){

    String msg = "1桁の自然数です";
    if (num < 1){
      msg = "1桁の自然数ではありません";
    }
    if (num > 9){
      msg = "1桁の自然数ではありません";
    }

  }
}
