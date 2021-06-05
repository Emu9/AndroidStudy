package com.example.practices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "★";

    /**
     * おお！境界値まわりを実行したのがわかる良い内容ですね！
     * かなり良きです！◎
     * */
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
//
//        judgmentNumber3(0);
//        judgmentNumber3(1);
//        judgmentNumber3(2);

//        multiplication();

//        multiplication();
//        multiplication();
//        isValueIsOneDigits(0);
//        isValueIsOneDigits(1);
//        isValueIsOneDigits(9);
//        isValueIsOneDigits(10);

//        int galleryEntranceCharge = galleryEntranceChargeCalculate(4);
//        Log.d(TAG, String.valueOf(galleryEntranceCharge));
//        galleryEntranceCharge = galleryEntranceChargeCalculate(5);
//        Log.d(TAG, String.valueOf(galleryEntranceCharge));
//        galleryEntranceCharge = galleryEntranceChargeCalculate(19);
//        Log.d(TAG, String.valueOf(galleryEntranceCharge));
//        galleryEntranceCharge = galleryEntranceChargeCalculate(20);
//        Log.d(TAG, String.valueOf(galleryEntranceCharge));

//        frontRearReplacingVariableValue(1,2);
//        UpToNumberRecurringOutFizzBuzz();
//        inputNumPrimeFactorization(100);
//        outputLogArrayList();
//        outputLogHashMap();
        practice20();
    }

    // ok!! javadocも記載されててかなり良きです。
    // paramの後ろは変数名が入りますが、そのあとに説明を追加しないと　「タグの説明が欠如しています」と警告されます。
    // なので説明を挿入すると尚良いですね〇
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


    // ok!
    // { の前にスペースがないのが気になりましたが、構文的には問題なしです！<br>
    //     SaveAction 有効にするとbuild時に整えてくれるのでおすすめです。<br>
    //     ファイル→設定→その他の設定→保存アクション→一般項目内の↑２つチェック、Formatiingなんちゃらの↑２つチェックで、おけです。
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

    // ok!
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

    // ok!
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

    // ok!
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

    // ok! 条件まとめたのですね。良いと思います！
    // 条件が増えて横に長くなるようであれば条件1つずつ分けてあげるのもありです。
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

    // ok!
    // 複数条件がある場合、アーリーリターンという手法を取ることでネストを減らせることもできます。
    // ※アーリーリターン 早期に処理をreturn;させ、後続の処理を見なくても読み手に伝えさせる事が出来ます。
    // ただ、この場合はこのままで全然問題なしです！
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


    // ok!
    // 変数の付け方良いですね！わかりやすいです！
    // 定義値を使用する場合は、finalを付けると良いですよ！
    // String passing = "合格"; → final String passing = "合格";
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
        final String passing = "合格";
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

    // ok!
    // かなり見やすいですね。YearMonthクラス使うのかなり良きデス。◎
    // 途中でアーリーリターンを使用するともう少し見やすくなりますよ！
    /**
     * 9	"月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
     *
     * また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。"
     * @param Month
     */
    public void showMonthDays(int Month) {
        // if(Month <= 0 || Month > 12){
        //     Log.d(TAG,"入力が間違っています");
        // }
        // else if(Month == 2){
        //     Log.d(TAG,"28");
        // }
        // else {
        //     YearMonth yearMonthObject = YearMonth.of(2021, Month);
        //     int daysInMonth = yearMonthObject.lengthOfMonth();
        //     Log.d(TAG, String.valueOf(daysInMonth));
        // }

        if (Month <= 0 || Month > 12) {
            Log.d(TAG, "入力が間違っています");
            return;
        }

        if (Month == 2) {
            Log.d(TAG, "28");
        } else {
            YearMonth yearMonthObject = YearMonth.of(2021, Month);
            int daysInMonth = yearMonthObject.lengthOfMonth();
            Log.d(TAG, String.valueOf(daysInMonth));
        }
    }


    // ok!
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


    /**
     * 11	1~10までの数字を繰り返し出力してみよう。
     */
    public void UpToNumberRecurringOut(){
        for(int i = 1; i <= 10; i++){
            Log.d(TAG, String.valueOf(i));
        }
    }

    /**
     * 12	九九の結果を出力してみよう。1*1 ~ 9*9
     */


    public void multiplication(){
        for(int k = 1; k <= 9; k++){
            Log.d(TAG, "------------------------------");
            Log.d(TAG, k + "の段");
            for(int t = 1; t <= 9; t++){
                Log.d(TAG, "------------------------------");
                Log.d(TAG, String.valueOf(k * t));
            }
        }
    }

    /**
     * 13	整数値を入力させ、その値が一桁の自然数かそうでないか判定するプログラムを作成せよ。
     * @param i
     */
    public void isValueIsOneDigits(int i){
        if(i > 0 && i <= 10){
            Log.d(TAG, String.valueOf(i) + "は一桁の自然数です");
        }
        else{
            Log.d(TAG, String.valueOf(i) + "は一桁の自然数ではありません");
        }
    }

    /**
     * 14	美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。
     * @param count 美術館の総入場人数
     * @return 美術館の総入場料金
     */
    public int galleryEntranceChargeCalculate(int count){
        if(count >= 20){
            return count * 500;
        }
        else if (count >= 5){
            return count * 550;
        }
        else {
            return count * 600;
        }
    }

    /**
     * 15	"異なる整数値を2つ入力し、それぞれ別の変数に格納する。
     * そして、それらの変数の値を入れ替える前、入れ替えた後で出力する。"
     */
    public void frontRearReplacingVariableValue(int x,int y){
        int a = x;
        int b = y;
        Log.d(TAG, "入れ替え前");
        Log.d(TAG, String.valueOf(a));
        Log.d(TAG, String.valueOf(b));
        a = y;
        b = x;
        Log.d(TAG, "入れ替え後");
        Log.d(TAG, String.valueOf(a));
        Log.d(TAG, String.valueOf(b));

    }


    /**
     * 16	1から100までの値を繰り返しで表示するが、
     * 3の倍数の時はfoo、5の倍数の時はbarと数字の代わりに表示するプログラムを作成せよ。
     * なお、3と5の両方の倍数の時はfoobarと表示される。
     */
    public void UpToNumberRecurringOutFizzBuzz(){
        String foo = "foo";
        String bar = "bar";
        String foobar = "foo" + "bar";
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                Log.d(TAG, foobar);
            }
            else if(i % 3 == 0) {
                Log.d(TAG, foo);
            }
            else if(i % 5 == 0) {
                Log.d(TAG, bar);
            }
            else{
                Log.d(TAG, String.valueOf(i));
            }
        }
    }

    /**
     * 17	自然数の入力値を素因数分解して結果を表示するプログラムを作成せよ。
     * @param num 整数
     */
    public void inputNumPrimeFactorization(int num){
        Log.d(TAG, num + "=");
        for(int i = 2;i<=num;i++){
            if(num % i == 0){
                num /= i;
                if(num == 1) Log.d(TAG, String.valueOf(i));
                else Log.d(TAG, String.valueOf(i) + "✕");
                i = 1;
            }
        }
    }

    /**
     * 18	"以下のArrayListを拡張for文でログに出力しよう。
     *
     *       ArrayList<String> list = new ArrayList<>();
     *         list.add(""ハンバーガー"");
     *         list.add(""チーズバーガー"");
     *         list.add(""ダブルチーズバーガー"");"
     */
    public void outputLogArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");

        for(String item:list){
            Log.d(TAG, item);
        }
    }

    /**
     * 19	"以下のHashMapを拡張for分でログに出力しよう。
     *
     *         //HashMapインスタンスを生成
     *         Map<String, Integer> map = new HashMap<>();
     *         //各科目の科目名と得点を要素として追加
     *         map.put(""国語"",90);
     *         map.put(""数学"",80);
     *         map.put(""英語"",70);"
     */
    public void outputLogHashMap(){
        //HashMapインスタンスを生成
        Map<String, Integer> map = new HashMap<>();
        //各科目の科目名と得点を要素として追加
        map.put("国語",90);
        map.put("数学",80);
        map.put("英語",70);


        for(Map.Entry<String, Integer> entry : map.entrySet()){
            Log.d(TAG, entry.getKey() + " : " + entry.getValue());
        }
    }

    /**
     * 20  forループをStream APIのforEachメソッドで置き換えよ。[+α] コードをより短くなるように改良せよ。
     *   static public void practice10() {
     *     List<String> helloWorld = new ArrayList<String>(3);
     *     helloWorld.add("Hello");
     *     helloWorld.add(" ");
     *     helloWorld.add("World");
     *     helloWorld.add("!");
     *     for (int i = 0; i < helloWorld.size(); i++) {
     *       System.out.print(helloWorld.get(i));
     *     }
     *   }
     */

    static public void practice20() {
            List<String> helloWorld = new ArrayList<>();
            helloWorld.add("Hello");
            helloWorld.add(" ");
            helloWorld.add("World");
            helloWorld.add("!");
            for (int i = 0; i < helloWorld.size(); i++) {
                Log.d(TAG,helloWorld.get(i));
            }
        }
}