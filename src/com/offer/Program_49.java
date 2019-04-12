package com.offer;

import java.util.Arrays;

/**
 * 丑数
 * https://www.cnblogs.com/lfeng1205/p/6932328.html
 */
public class Program_49 {
    public int GetUglyNumber_Solution(int N) {
        if (N <= 6)
            return N;
        int[] dp = new int[N];

        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < N; i++) {
            int next2 = dp[i2] * 2;
            int next3 = dp[i3] * 3;
            int next5 = dp[i5] * 5;

            dp[i] = Math.min(next2, Math.min(next3, next5));

            if (dp[i] == next2)
                i2++;
            if (dp[i] == next3)
                i3++;
            if (dp[i] == next5)
                i5++;
        }
        return dp[N - 1];
    }
}
