package com.offer;

/**
 * 数组中只出现一次的数字
 */
public class Program_56 {
    public int getNumAppearsOnce(int[] nums){
        if (nums == null || nums.length <= 2)
            throw new IllegalArgumentException("nums size must bigger than 2");

        int result = 0;
        for (int i = 0; i < nums.length; i++)
            result ^= nums[i];

        return result;
    }
}
