package com.example.sample.second;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SekaiNoNabeatsu {

    private static final Map<Integer, String> aho;

    static {
        //Mapはfinalをつけただけでは定数化できないので、unmodifiableMapメソッドを使用する必要があるとかないとかあるとか
        aho = Collections.unmodifiableMap(addAho());
    }

    public static String becomeFool(int cnt) {
        if (cnt % 3 != 0) {
            return String.valueOf(cnt);
        }
        int upperLimit = aho.size() * 3;
        if (cnt > upperLimit) {
            return String.valueOf(cnt);
        }
        return aho.get(cnt);
    }

    private static Map<Integer, String> addAho() {
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "さぁん!");
        map.put(6, "ろぉく!");
        map.put(9, "きゅう!");
        map.put(12, "じゅうに!");
        map.put(15, "じゅうご!");
        map.put(18, "じゅうはちぃ!");
        map.put(21, "にじゅういち!");
        map.put(24, "にじゅうよん!");
        map.put(27, "にじゅうなな!");
        map.put(30, "さんじゅう!");
        return map;
    }
}
