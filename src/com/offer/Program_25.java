package com.offer;

/**
 * 合并二个排序的链表
 */
public class Program_25 {
    //递归
    public ListNode Merge01(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode newHead = null;
        if (list1.val >= list2.val) {
            newHead = list2;
            newHead.next = Merge01(list1, list2.next);
        } else {
            newHead = list1;
            newHead.next = Merge01(list1.next, list2);
        }

        return newHead;
    }
    //迭代
    public ListNode Merge02(ListNode list1,ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
            }
            cur = cur.next;
        }
        if (list1 != null) {
            cur.next = list1;
        } else {
            cur.next = list2;
        }
        return head.next;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
