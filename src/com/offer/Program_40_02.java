package com.offer;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 最小的k个数
 * 用一个大顶堆来维护最小堆
 */
public class Program_40_02 {
    public ArrayList<Integer> GetLeastNumbers_Soulution(int[] nums, int k) {
        if (k > nums.length || k <= 0)
            return new ArrayList<>();
        //lamada表达式，使用PriorityQueue构建一个大顶堆
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }

}
