package com.offer;

import java.util.Arrays;

/**
 * 最长不含重复字符的子字符串
 * https://blog.csdn.net/m0_37862405/article/details/80369128
 */
public class Program_48 {
    public int longestSubStringWithoutDuplication(String str) {
        int curLen = 0, maxLen = 0;
        int[] preIndexs = new int[26];

        Arrays.fill(preIndexs, -1);

        for (int curI = 0; curI < str.length(); curI++) {
            int c = str.charAt(curI) - 'a';
            int preI = preIndexs[c];

            if (preI == -1 || curI - preI > curLen) {
                curLen++;
            } else {
                maxLen = Math.max(curLen, maxLen);
                curLen = curI - preI;
            }
            preIndexs[c] = curI;
        }

        maxLen = Math.max(curLen, maxLen);
        return maxLen;
    }
}
