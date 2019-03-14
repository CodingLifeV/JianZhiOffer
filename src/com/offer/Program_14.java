package com.offer;

/**
 * 剪绳子(动态规划)
 */
public class Program_14 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max( j * (i - j), dp[j] * (i - j)));
            }
        }
        return dp[n];
    }
}
