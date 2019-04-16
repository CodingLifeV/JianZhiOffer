package com.offer;


/**
 * 不用加减乘除做加法
 */
public class Program_65 {
    public int Add(int a, int b) {
        return b == 0 ? a : Add(a ^ b, (a & b) << 1);
    }
}
