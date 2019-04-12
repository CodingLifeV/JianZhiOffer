package com.offer;

/**
 * 连续子数组的最大和
 * 动态规划
 */
public class Program_42 {
    public int FindGreatestSumOfSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            if (sum > maxSum)
                maxSum = sum;
        }
        return maxSum;
    }
}
