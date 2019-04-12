package com.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * 第一个只出现一次的字符位置
 */
public class Program_50 {
    public int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[26];
        for (int i = 0; i < str.length(); i++)
            cnts[str.charAt(i)]++;

        for (int i = 0; i < str.length(); i++)
            if (cnts[str.charAt(i)] == 1)
                return i;

        return -1;
        /*Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
        for (int i = 0; i < str.length(); i++)
            if (map.get(str.charAt(i)) == 1)
                return i;
        return -1;
        */
    }
}
