package com.offer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 礼物的最大价值
 */
public class Program_47 {
    public int getMost(int[][] values) {
        if (values == null && values.length == 0 && values[0].length == 0)
            return 0;
        int n = values[0].length;
        int[] dp = new int[n];

        for (int j = 0; j < n; j++) {
            dp[j] += values[0][j];
        }

        for (int[] value : values) {
            dp[0] += value[0];
            for (int j = 1; j < n; j++) {
                dp[j] = Math.max(dp[j], dp[j - 1]) + value[j];
            }
        }
        return dp[n - 1];
    }
}
