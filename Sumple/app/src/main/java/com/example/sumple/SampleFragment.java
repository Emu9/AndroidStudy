package com.example.sumple;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.sumple.status.RpsStatus;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class SampleFragment extends Fragment {

    // コードは基本的にAOSPに沿って書いています。なのでフィールド変数とやグローバル変数には頭にm付けてます。Androidを開発するなら頭にm付けよう！！！！staticだったら頭にsだよ！
    private View mView;
    private TextView mMyHandResult;
    private TextView mEnemyResult;
    private TextView mBattleResult;
    private TextView mBattleAllResult;
    private int mBattleCount = 0;
    private ArrayList mBattleResultArray;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_sumple, container, false);

        // UIに紐づけ
        mMyHandResult = mView.findViewById(R.id.text_view_my_hand_result); // mViewからR.id.text_view_result1を探して紐づけてるよ！これをすることで該当のUIが操作できる！
        mEnemyResult = mView.findViewById(R.id.text_view_enemy_hand_result);
        mBattleResult = mView.findViewById(R.id.text_view_battle_result);
        mBattleAllResult = mView.findViewById(R.id.text_battle_all_result);
        mBattleResultArray = new ArrayList();


        Button button = mView.findViewById(R.id.button1);

        // リスナー設定(この場合はボタン押下時の処理だよ！
        button.setOnClickListener(new View.OnClickListener() { // ←灰色になっている箇所にカーソル合わせてをAlt+Enterを押すと勝手に最適なコードに変換してくれたりするよ！この場合はラムダ式になる！
            @Override
            public void onClick(View v) {
                //OnClickListenerは押された時の処理。
                // ボタン押下時にじゃんけんの結果判定を行う。
                // スキルある人はここの処理を書き換えてみよう！！！
                // 仕様：
                // １：自分が出す手を3パターンからランダムで選択する。
                // ２：相手が出す手を3パターンからランダムで選択する。
                // ３：自分と相手の手を比較し、じゃんけんの勝者名を画面に表示する。尚、手の比較方法は問わない。

                // ここからサンプル処理

                // 文言リセット
                mMyHandResult.setText("");
                mBattleResult.setText("");
                mEnemyResult.setText("");

                //バトルカウント計算
                if (mBattleCount >= 3) {
                    mBattleCount = 0;
                    mBattleAllResult.setText("対戦結果 : なし");
                    mBattleResultArray.clear();
                } else {
                    mBattleCount++;
                }


                // じゃんけんの出す手
                RpsStatus resultMyRps = getRndRps();
                mMyHandResult.setText("自分の手 : " + resultMyRps.getLabel());
                RpsStatus resultEnemyRps = getRndRps();
                mEnemyResult.setText("相手の手 : " + resultEnemyRps.getLabel());

                // スレッド処理
                // 結果処理呼び出しmBattleResultArray
                String battleResult = getRpsBattleResult(resultMyRps, resultEnemyRps);
                mBattleResult.setText(battleResult);
                mBattleResultArray.add(battleResult);
                // 無理やりすぎるけど良いよね、、、、
                if (mBattleResultArray.size() == 3) {
                    int winCount = 0;
                    for (Object res : mBattleResultArray) {
                        if (!res.equals("勝利！")) return;
                        winCount++;
                    }
                    if (winCount >= 2) {
                        new Handler(Looper.getMainLooper()).postDelayed(() -> {
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction transaction = Objects.requireNonNull(fragmentManager).beginTransaction();
                            transaction.replace(R.id.frame_layout_main, new GameClearFragment());
                            transaction.commit();
                        }, 3000); // 3000ミリ秒後に実行
                    }
                }

            }
        });

        return mView;
    }

    /**
     * じゃんけんの出す手をランダムで決めてくれる。100回に1回くらいは後出しする。
     *
     * @return じゃんけんの出す手
     */
    private RpsStatus getRndRps() {
        Random rand = new Random();
        int num = rand.nextInt(100);
        if (num == 100) return RpsStatus.CHEAT;
        int result = rand.nextInt(3);
        return RpsStatus.getById(result);
    }

    /**
     * じゃんけんの結果を判定してくれる。
     */
    private String getRpsBattleResult(RpsStatus myHand, RpsStatus enemyHand) {
        if (myHand == enemyHand) return "あいこです。残念...";

        // 最近enum使いこなすとカッコいいという偏見持ってます
        switch (myHand) {
            case ROCK:
                if (enemyHand == RpsStatus.PAPER) return "敗北(笑)";
                if (enemyHand == RpsStatus.SCISSORS) return "勝利！";
            case SCISSORS:
                if (enemyHand == RpsStatus.PAPER) return "勝利！";
                if (enemyHand == RpsStatus.ROCK) return "敗北(笑)";
            case PAPER:
                if (enemyHand == RpsStatus.ROCK) return "勝利！";
                if (enemyHand == RpsStatus.SCISSORS) return "敗北(笑)";
            default:
                return "不正？！";
        }


    }

}
