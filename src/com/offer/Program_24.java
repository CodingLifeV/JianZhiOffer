package com.offer;

/**
 * 反转链表
 */
public class Program_24 {
    //头插
    public ListNode ReverseList01(ListNode pHead) {
       ListNode newList = new ListNode(-1);
       while (pHead != null) {
           ListNode next = pHead.next;
           pHead.next = newList.next;
           newList.next = pHead;
           pHead = next;
       }
       return newList.next;
    }
    //递归
    public ListNode ReverseList02(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode next = pHead.next;
        pHead.next = null;
        ListNode newHead = ReverseList02(next);
        next.next = pHead;
        return newHead;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
