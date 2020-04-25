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

    @Override
    public void simulate() {
        CHZ_30Day_MiddleoftheLinkedList test = new CHZ_30Day_MiddleoftheLinkedList();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);
        ListNode middle = middleNode(l1);
        System.out.print("l1 := ");
        l1.display();
        System.out.print("Middle of the linked list := ");
        middle.display();
    }
}
