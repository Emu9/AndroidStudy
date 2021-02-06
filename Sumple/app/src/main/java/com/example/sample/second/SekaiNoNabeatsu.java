package com.example.sample.second;

import java.util.HashMap;


public class SekaiNoNabeatsu {

    private static HashMap<Integer, String> aho;

    public SekaiNoNabeatsu() {
        aho = new HashMap<>();
        AddAho();
    }

    public static String BecomeFool(int cnt) {
        if (cnt % 3 != 0) {
            return String.valueOf(cnt);
        }
        return aho.get(cnt);
    }

    private static void AddAho() {
        aho.put(3, "さぁん!");
        aho.put(6, "ろぉく!");
        aho.put(9, "きゅう!");
        aho.put(12, "じゅうに!");
        aho.put(15, "じゅうご!");
        aho.put(18, "じゅうはちぃ!");
        aho.put(21, "にじゅういち!");
        aho.put(24, "にじゅうよん!");
        aho.put(27, "にじゅうなな!");
        aho.put(30, "さんじゅう!");
    }
}
