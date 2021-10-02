package android.study.todo.model.utility;

import android.content.res.AssetManager;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AssetsUtil {

    public static JSONArray getJson() {
        AssetManager assetManager = MyContext.getContext().getAssets();
        InputStream inputStreamReader;
        try {
            inputStreamReader = assetManager.open("todo.json");
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
