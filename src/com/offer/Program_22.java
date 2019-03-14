package com.offer;

/**
 * 链表中倒数第k个结点
 */
public class Program_22 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null) return null;
        ListNode P1 = head;
        while (P1 != null && k-- > 0) {
            P1 = P1.next;
        }
        if (k > 0)
            return null;
        ListNode P2 = head;
        while (P1 != null) {
            P1 = P1.next;
            P2 = P2.next;
        }
        return P2;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
