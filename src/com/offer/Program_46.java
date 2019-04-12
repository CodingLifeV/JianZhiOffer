package com.offer;

/**
 * 把数字翻译成字符串
 * https://www.jianshu.com/p/80e1841909b7
 */
public class Program_46 {
    public int numDecodings(String s) {
        if (s == null && s.length() == 0)
            return 0;
        int f2 = 1, f1 = 0, g ;

        for (int i = s.length() - 2; i >= 0; i--) {
            if (Integer.parseInt( s.charAt(i) + "" + s.charAt(i + 1) ) > 26) {
                g = 0;
            } else {
                g = 1;
            }
            int temp = f1;
            f2 = f2 + g * f1;
            f1 = temp;
        }
        return f2;
    }
}
