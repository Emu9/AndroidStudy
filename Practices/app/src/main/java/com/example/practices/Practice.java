package com.example.practices;

import android.util.Log;

import java.util.Calendar;

public class Practice {

  // ok
  public void practice1(int x, int y){
    if(x > y){
      PracticeLog.d("==========================================");
      PracticeLog.d("Practice1 Result");
      PracticeLog.d("xはyより大きい");
    }
  }
  // ok
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
  // ok
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
  // ok
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

  /**
   * ok!
   * 変数の再代入が気になりましたが、明確にダメというわけではないのでこれはありですね！
   * */
  public  void  practice5(int num){
    String msg = "奇数";
    if (num % 2==0){
      msg = "偶数";
    }
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice5 Result");
    PracticeLog.d(msg);
  }

  /**
   * この書き方....天才ですか....
   * これは脱帽です。１００点ですね！
   * 正直この回答は予想していなかったです。しゅごい。。。
   * */
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

  /**
   * ok!
   * 変数4パターン定義(不可・優・良・可)して条件一致したら該当する変数をlog出力する、という方式でも良いかもしれません。
   * 優だった場合、後続の条件分岐は見なくともよいので、アーリーリターンが可能だったりします。
   * が、これくらいであれば見やすいのでこのままでも全然良いと思います！
   * */
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

  /**
   * 綺麗な書き方ですね！
   * アーリーリターンのパターンも記載してみましたが、正直微妙かもです..。
   * アーリーリターンの弱点として、あとから後続に処理を追加したい場合に困るってのがあるので、必ずしも使うべきというわけではないですね。
   * */
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

    // 別解
    final String NG = "不合格";
    final String OK = "合格";

    PracticeLog.d("==========================================");
    PracticeLog.d("Practice8 Result");

    // Todo 本来であればアーリーリターンを使用する場合、条件文を反対にし、NGの場合にリターンを使用するのが良いです。
    if ((midTermExam >= 60) && (finalExam >= 60)){
      PracticeLog.d(OK);
      return;
    }

    if (midTermExam + finalExam >= 130){
      PracticeLog.d(OK);
      return;
    }

    if (midTermExam + finalExam >= 100){
      if (midTermExam >= 90){
        PracticeLog.d(OK);
        return;
      }
      if (finalExam >= 90){
        PracticeLog.d(OK);
        return;
      }
    }

    PracticeLog.d(NG);
  }
  /**
   * ok!
   * Java 1.8から登場したYearMonthクラスを使用するとさらにすっきりします！
   * */
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

    // https://docs.oracle.com/javase/jp/8/docs/api/java/time/YearMonth.html 参考
    // その月の日数を返却してくれます。
    YearMonth yearMonthObject = YearMonth.of(2021, Month);
    int daysInMonth = yearMonthObject.lengthOfMonth();
    PracticeLog(String.valueOf(daysInMonth));
  }

  /**
   * ok
   * */
  public void practice10(int num){
    String msg = "odd";
    if ((num % 2) ==0){
      msg = "even";
    }
    PracticeLog.d("==========================================");
    PracticeLog.d("Practice10 Result");
    PracticeLog.d(msg);
  }

  /**
   * ok!
   * 引数の数だけ1~10を出力してくれるのですね笑
   * */
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

  /**
   * ok!
   * */
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
