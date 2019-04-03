package com.offer;

/**
 * 数组中出现次数超过一半的数字
 * https://www.cnblogs.com/csxcode/p/3720696.html
 */
public class Program_39 {
    public int MoreThanHalfNum_Soulution(int[] nums) {
        int ret = nums[0], cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cnt == 0) {
                ret = nums[i];
                cnt++;
            } else if (nums[i] == ret) {
                cnt++;
            } else {
                cnt--;
            }
        }
        return ret;
    }
}
