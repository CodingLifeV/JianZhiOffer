package com.offer;

import java.util.Stack;

/**
 * 对称二叉树
 */
public class Program_30 {
    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> dataStack = new Stack<>();

    public void push(int node) {
        dataStack.push(node);
        minStack.push(minStack.isEmpty() ? node : Math.min(node, minStack.peek()));
    }

    public void pop(){
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
