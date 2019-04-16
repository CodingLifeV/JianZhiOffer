package com.offer;


/**
 * 不用加减乘除做加法
 */
public class Program_67 {
    public int StrToInt(String str) {
        if (str == null && str.length() == 0)
            return 0;
        int ret = 0;
        boolean isNegative = str.charAt(0) == '-';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i == 0 && (c == '+' || c == '-'))
                continue;
            if (c > '9' || c < '0')
                return 0;
            ret = ret * 10 + (c - '0');
        }

        return isNegative ? -ret : ret;
    }
}
