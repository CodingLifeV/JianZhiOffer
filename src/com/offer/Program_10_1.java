package com.offer;

/**
 * 斐波那契数列
 */
public class Program_10_1 {
    public int Fibonacci01(int n) {
        if (n <= 1)
            return n;
        int[] fibo = new int[n+1];
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo[n];
    }
    public int Fibonacci02(int n) {
        if (n <= 1)
            return n;
        int pre1 = 1, pre2 = 0;
        int fib = 0;
        for (int i = 2; i<= n; i++ ) {
            fib = pre1 + pre2;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }
}
