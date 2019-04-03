package com.offer;

import javax.jnlp.IntegrationService;
import java.util.ArrayList;

/**
 * 最小的k个数
 * 快排实现
 */
public class Program_40_01 {
    private ArrayList<Integer> ret = new ArrayList<>();
    public ArrayList<Integer> GetLeastNumbers_Soulution(int[] nums, int k) {
        if (k > nums.length || k <= 0)
            return ret;
        findKthSmallest(nums, k - 1);
        for (int i = 0; i < k; i++) {
            ret.add(nums[i]);
        }
        return ret;
    }
    private void findKthSmallest(int[] nums, int k) {
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int j = partition(nums, lo, hi);
            if (j == k)
                break;
            else if (j > k)
                hi = j - 1;
            else
                lo = j + 1;
        }
    }
    private int partition(int[] nums, int lo, int hi) {
        int i = lo, j = hi + 1;
        int p = nums[lo];
        while (true) {
            while (i < hi && nums[++i] < p);
            while (j > lo && nums[--j] > p);
            if (i >= j)
                break;
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
