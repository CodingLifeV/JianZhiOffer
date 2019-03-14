package com.offer;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class Program_21 {
    public void reOrderArray(int[] nums) {
        int oddCnt = 0;//奇数个数
        for (int num : nums) {
            if (num % 2 == 1) {
                oddCnt++;
            }
        }

        int[] copy = nums.clone();
        int i = 0, j = oddCnt;
        for (int num : copy) {
            if (num % 2 == 1)
                nums[i++] = num;
            else
                nums[j++] = num;
        }
    }
}
