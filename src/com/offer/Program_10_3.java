package com.offer;

/**
 * 矩形覆盖
 */
public class Program_10_3 {
    public int RectCover(int n){
        if (n <= 2)
            return n;
        int pre2 = 1, pre1 = 2;
        int result = 0;
        for (int i = 3; i <= n; i++ ) {
            result = pre1 + pre2;
            pre2 = pre1;
            pre1 = result;
        }
        return result;
    }
}
