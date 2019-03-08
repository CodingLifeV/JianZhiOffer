package com.offer;

import java.util.Stack;

/**
 * 用二个栈实现队列
 */
public class Program_9 {
    private Stack<Integer> in;
    private Stack<Integer> out;

    public void push(int node) {
        in.push(node);
    }

    public int pop() throws Exception{
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        if (out.isEmpty())
            throw new Exception("queue is Empty");

        return out.pop();
    }
}
