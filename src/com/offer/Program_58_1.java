package com.offer;

/**
 * 翻转单词顺序列
 */
public class Program_58_1 {
    public String ReverseSentence(String str){
        if (str.length() == 0 || str == null)
            return null;
        char[] arr = str.toCharArray();
        int n = str.length();
        int i = 0, j = 0;
        while (j <= n) {
            if (j == n || arr[j] == ' ') {
                reverse(arr, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        reverse(arr, 0, n - 1);
        return new String(arr);
    }
    private void reverse(char[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
