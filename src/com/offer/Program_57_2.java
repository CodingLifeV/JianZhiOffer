package com.offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 和为 S 的连续正整数序列
 * 双指针
 * https://www.nowcoder.com/questionTerminal/c451a3fd84b64cb19485dad758a55ebe
 */
public class Program_57_2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        int plow = 1, phigh = 2;
        while (plow < phigh) {
            int cur = (phigh + plow) * (phigh - plow + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = plow; i <= phigh; i++)
                    list.add(i);
                ret.add(list);
                plow++;
            } else if (cur < sum) {
                phigh++;
            } else {
                plow++;
            }
        }
        return ret;
    }
}
