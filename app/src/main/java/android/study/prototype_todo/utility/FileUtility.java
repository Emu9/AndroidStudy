package android.study.prototype_todo.utility;

import android.content.res.AssetManager;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtility {


    /**
     * アプリ固有の内部ストレージに対する書き込み処理
     *
     * @param fileName 書き込み先のファイル名
     * @param content  書き込む内容
     */
    public static void saveFile(String fileName, String content) {

        // 保存先指定
        File file = new File(MyContext.getContext().getFilesDir(), fileName);

        // 書き込み
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * アプリ固有の内部ストレージに対する読み込み処理<br>
     * String->JsonArrayに変換する場合は、以下のコードで実現出来る。<br>
     * JSONArray jsonArray = new JSONArray(str);
     *
     * @param fileName 書き込み先のファイル名
     * @return 読み込み内容 読み込み先が存在しない場合、空で返却する。
     */
    public static String readFile(String fileName) {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            text = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

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
