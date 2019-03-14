package com.offer;


/**
 * 旋转数组中的最小值
 */
public class Program_11 {
    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0) return 0;
        int l = 0, h = nums.length - 1;
        while (l < h) {
            int mid = l + (h-l)/2 ;
            if (nums[mid] == nums[l] && nums[mid] == nums[h]) {//特殊情况
                return minNumber(nums, l, h);
            } else if (nums[mid] <= nums[h]) {
                h = mid;
            } else {
                l = mid + 1;
            }
        }
        return nums[l];
    }
    private int minNumber(int[] nums, int l, int h) {
        for (int i = l ; i < h; i++) {
            if (nums[i] > nums[i+1]) {
                return nums[i+1];
            }
        }
        return nums[l];
    }
}
