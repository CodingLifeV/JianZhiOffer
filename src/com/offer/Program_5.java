package com.offer;

public class Program_5 {
    /*
     *
     */
    public String replaceSpace(StringBuffer str) {
        int P1 = str.length() - 1;
        for (int i = 0; i <= P1; i++) {
            if (str.charAt(i) == ' ') {
                str.append(" ");
            }
        }
        int P2 = str.length() - 1;
        //注意P2 > P1 条件和 &&(或) 关系运算符
        while (P2 > P1 && P1 >= 0) {
            char c = str.charAt(P1--);
            if (c == ' ') {
                str.setCharAt(P2--, '0');
                str.setCharAt(P2--, '2');
                str.setCharAt(P2--, '%');
            } else {
                str.setCharAt(P2--, c);
            }
        }
        return str.toString();
    }
}
