package com.offer;


/**
 * 求1 + 2 + 3 + ... + n
 */
public class Program_64 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum += Sum_Solution(n - 1)) > 0);
        return sum;
    }
}
