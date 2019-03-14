package com.offer;

/**
 * 二进制中1的个数
 * 把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0。
 * 那么一个整数的二进制表示中有多少个1，就可以进行多少次这样的操作。
 * https://www.cnblogs.com/edisonchou/p/4752086.html
 */
public class Program_15 {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n-1);
        }
        return cnt;
    }
}
