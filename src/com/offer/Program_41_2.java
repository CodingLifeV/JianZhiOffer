package com.offer;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 字符流中第一个不重复的字符
 */
public class Program_41_2 {
    private int[] cnts = new int[256];
    private Queue<Character> queue = new LinkedList<>();
    public void insert(char ch) {
        cnts[ch]++;
        queue.add(ch);
        while (!queue.isEmpty() && cnts[queue.peek()] > 1) {
            queue.poll();
        }
    }
    public char FirstAppearingOnce() {
        return queue.isEmpty() ? '#' : queue.peek();
    }
}
