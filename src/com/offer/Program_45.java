package com.offer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 把数组排成最小的数
 */
public class Program_45 {
    public String  PrintMinNumber(int[] numbers) {
       if (numbers.length == 0 && numbers == null)
           return null;
       String[] nums = new String[numbers.length];

       for (int i = 0; i < numbers.length; i++) {
           nums[i] = numbers[i] + "";
       }
       //Arrays.sort()
       Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

       String ret = "";
       for (String str : nums) {
           ret += str;
       }

       return ret;
    }
}
