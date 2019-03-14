package com.offer;

/**
 * 变态跳台阶
 */
public class Program_10_4 {
    //递归
    public int JumpFloorII01(int target) {
        if (target <= 0) {
            return 0;
        }
        if (target == 1) {
            return 1;
        }
        return 2 * JumpFloorII01(target-1);
    }
    //非递归
    public int JumpFloorII02(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        int result = 1;
        for (int i = 2; i <= target; i++) {
            result = 2 * result;
        }
        return result;
    }
}
