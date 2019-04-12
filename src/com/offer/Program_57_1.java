package com.offer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 和为 s 的二个数字
 * 双指针
 */
public class Program_57_1 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum){
        int i = 0, j = array.length - 1;
        while (i < j) {
            int cur = array[i] + array[j];
            if (cur == sum) {
                return new ArrayList<>(Arrays.asList(array[i], array[j]));
            }
            if (cur < sum) {
                i++;
            } else {
                j++;
            }
        }
        return new ArrayList<>();
    }
}
