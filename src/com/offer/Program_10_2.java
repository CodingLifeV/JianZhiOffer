package com.offer;

/**
 * 跳台阶
 */
public class Program_10_2 {
    public int JumpFloor(int n) {
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int ret = 1;
        for (int i = 2; i < n; i++) {
            ret = pre1 + pre2;
            pre2 = pre1;
            pre1 = ret;
        }
        return ret;
    }
}
