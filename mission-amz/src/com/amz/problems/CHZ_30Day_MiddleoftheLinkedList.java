package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.ListNode;

public class CHZ_30Day_MiddleoftheLinkedList extends AbstractQuestion {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
