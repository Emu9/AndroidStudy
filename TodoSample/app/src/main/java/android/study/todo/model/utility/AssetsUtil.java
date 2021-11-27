package android.study.todo.model.utility;

import android.content.res.AssetManager;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AssetsUtil {

    /**
     * Assetsから指定したJsonファイルを取得する。
     *
     * @param jsonFileName jsonファイル名
     * @return JSONArrayJsonファイルの中身
     */
    public static JSONArray getJson(String jsonFileName) {
        AssetManager assetManager = MyContext.getContext().getAssets();
        InputStream inputStreamReader;
        try {
            inputStreamReader = assetManager.open(jsonFileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamReader));
            StringBuilder data = new StringBuilder();
            String str = bufferedReader.readLine();
            while (str != null) {
                data.append(str);
                str = bufferedReader.readLine();
            }
            inputStreamReader.close();
            bufferedReader.close();
            JSONArray array = new JSONArray(data.toString());
            ExpansionLog.d("★ JSONArray : " + array.toString());
            return array;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
        }
        return new JSONArray();
    }
}
