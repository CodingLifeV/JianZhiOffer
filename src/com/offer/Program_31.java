package com.offer;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 */
public class Program_31 {
    private Stack<Integer> stack = new Stack();
    public boolean IsPopOrder(int[] pushSequence, int[] popSequence) {
        int n = pushSequence.length;
        for (int pushIndex = 0, popIndex = 0; pushIndex < n; pushIndex++) {
            stack.add(pushSequence[pushIndex]);
            while (!stack.isEmpty() && popIndex < n && stack.peek() == popSequence[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}
