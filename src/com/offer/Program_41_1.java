package com.offer;

import java.util.PriorityQueue;

/**
 * 数据流中的中位数
 */
public class Program_41_1 {
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1, o2) -> o2 - o1);
    private PriorityQueue<Integer> right = new PriorityQueue<>();
    private int N = 0;//N为偶数的情况下插入到右半边
    public void insert(int val) {
        if (N % 2 == 0) {
            left.add(val);
            right.add(left.poll());
        } else {
            right.add(val);
            left.add(right.poll());
        }
        N++;
    }
    public Double getMedian(){
        if (N % 2 == 0)
            return (left.peek() + right.peek()) / 2.0;
        else
            return (double)right.peek();
    }
}
