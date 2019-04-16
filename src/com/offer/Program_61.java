package com.offer;

import java.util.Arrays;

/**
 * 扑克牌顺子
 */
public class Program_61 {
    public boolean isContinuous(int[] nums) {
        if (nums.length < 5)
            return false;
        Arrays.sort(nums);

        int cnt = 0;
        for (int num : nums) {
            if (num == 0)
                cnt++;
        }

        for (int i = cnt; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1])
                return false;
            cnt -= nums[i+1] - nums[i] - 1;
        }

        return cnt >= 0;
    }
}
