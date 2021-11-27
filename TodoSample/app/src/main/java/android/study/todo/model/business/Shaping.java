package android.study.todo.model.business;

import android.study.todo.model.data.TodoData;
import android.study.todo.model.utility.AssetsUtil;
import android.study.todo.model.utility.ExpansionLog;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * データの整形用クラス<br>
 * Jsonから取得したデータをデータクラスに変換する。
 */
public class Shaping {

    private JSONArray mJSONArray;

    public Shaping() {
        mJSONArray = AssetsUtil.getJson("todo.json");
    }

    /**
     * Jsonからリストを取得<br>
     *
     * @return Jsonから取得した内容を詰めたデータクラス
     */
    public List<TodoData> getTodoJson() {
        List<TodoData> todoDataList = new ArrayList<>();
        // JsonArray型 [] で囲まれている中の {} ものたち。todo.jsonでは3つの{}があるため、lengthは3
        for (int i = 0; i < mJSONArray.length(); i++) {
            try {
                // 繰り返し取得
                JSONObject jsonObject = mJSONArray.getJSONObject(i);
                TodoData todoData = new TodoData();

                // title の設定
                String title = jsonObject.getString("title");
                todoData.setTitle(title);

                // text の設定
                String text = jsonObject.getString("text");
                todoData.setText(text);

                // deadline の設定
                String deadline = jsonObject.getString("deadline");
                todoData.setDeadlineTime(deadline);

                // List型に追加
                todoDataList.add(todoData);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return todoDataList;
    }


    public void test() {
        // JsonArray型 [] で囲まれている中の {} ものたち。todo.jsonでは3つの{}があるため、lengthは3
        for (int i = 0; i < mJSONArray.length(); i++) {
            try {
                // 繰り返し取得
                JSONObject jsonObject = mJSONArray.getJSONObject(i);
                ExpansionLog.d("★ : " + jsonObject);
                // JsonObjectから取得するためには、todo.jsonの左からむを指定して取得できる。
                String title = jsonObject.getString("title");
                ExpansionLog.d("★ : " + title);
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }

    }

    public TodoData makeTodoData() {

        return new TodoData();

    }


}
