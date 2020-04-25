package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.ListNode;

public class IP_G_RemoveNthNodeFromEndofList extends AbstractQuestion {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        int k = n;
        ListNode first = dummyHead;
        ListNode second = dummyHead;
        while (k-- >= 0) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummyHead.next;
    }

    @Override
    public void simulate() {
        IP_G_RemoveNthNodeFromEndofList test = new IP_G_RemoveNthNodeFromEndofList();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);
        System.out.print("l1 := ");
        l1.display();
        int n = 2;
        ListNode mod = removeNthFromEnd(l1, n);
        System.out.print("removed " + n + " from last := ");
        mod.display();
    }
}
