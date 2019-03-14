package com.offer;

/**
 * 链表中环的入口结点
 */
public class Program_23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null && pHead.next == null) return null;
        ListNode slow = pHead, fast = pHead;
        do {
            slow = slow.next;
            fast = fast.next;
        }while (slow != fast);
        fast = pHead;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
