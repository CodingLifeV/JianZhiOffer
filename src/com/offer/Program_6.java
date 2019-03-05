package com.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class Program_6 {
     //使用栈
    public ArrayList<Integer> printListFromTailToHead01(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> ret = new ArrayList<>();
        //注意使用isEmpty()判空，pop()方法和peek()方法
        //peek():返回栈顶的元素但不移除它; pop():返回栈顶元素并且移除它
        while (!stack.isEmpty()) {
            ret.add(stack.pop());
        }

        return ret;
    }
    //使用递归
    //注意if判断语句,不是while
    //注意addAll()方法的使用
    public ArrayList<Integer> printListFromTailToHead02(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead02(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    //使用头插法
    public ArrayList<Integer> printListFromTailToHead03(ListNode listNode) {
        //头结点
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }

        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }

        return ret;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
