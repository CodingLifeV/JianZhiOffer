package com.offer;

/**
 * 删除链表中重复的结点
 */
public class Program_18_2 {
    public ListNode deleteDuplication(ListNode phead) {
        if (phead == null || phead.next ==null) {
            return phead;
        }
        ListNode cur = phead;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return phead;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
