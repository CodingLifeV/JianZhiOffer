package com.offer;

/**
 * 二叉搜索树的后续遍历序列
 */
public class Program_33 {
    public boolean VerifySequenceOfBST(int[] sequence) {
        if (sequence.length == 0 && sequence == null)
            return false;
        return verify(sequence, 0, sequence.length - 1);
    }
    private boolean verify(int[] sequence, int first, int last) {
        if (last - first <= 1)
            return true;
        int rootVal = sequence[last];
        int cutIndex = first;
        while (cutIndex < last && sequence[cutIndex] <= rootVal) {
            cutIndex++;
        }
        for (int i = cutIndex; i < last; i++) {
            if (sequence[i] < rootVal)
                return false;
        }
        return verify(sequence, first, cutIndex - 1) &&
                verify(sequence, cutIndex, last - 1);
    }
}
