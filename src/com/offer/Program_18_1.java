package com.offer;

/**
 *
 */
public class Program_18_1 {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
       if (head == null || tobeDelete == null)
           return null;
       if (tobeDelete.next != null) {
           ListNode next = tobeDelete.next;
           tobeDelete.val = next.val;
           tobeDelete.next = next.next;
       } else {
           ListNode cur = head;
           while (cur.next != tobeDelete) {
               cur = cur.next;
           }
           cur.next = null;
       }
       return head;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
