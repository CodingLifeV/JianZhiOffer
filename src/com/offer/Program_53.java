package com.offer;

/**
 * 数字在排序数组中出现的次数
 */
public class Program_53 {
    public int GetNumberOfK(int[] nums, int k) {
        int first = binarySearch(nums, k);
        int last  = binarySearch(nums, k + 1);
        return (first == nums.length || nums[first] != k) ? 0 : last - first;
    }
    private int binarySearch(int[] nums, int k) {
        int l = 0, h = nums.length;
        while (l < h) {
            int m = l + (h - l) / 2;
            if (nums[m] < k) {
                l = m + 1;
            } else {
                h = m;
            }
        }
        return l;
    }
}
