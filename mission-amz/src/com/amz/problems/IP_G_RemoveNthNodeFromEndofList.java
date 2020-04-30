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

}
