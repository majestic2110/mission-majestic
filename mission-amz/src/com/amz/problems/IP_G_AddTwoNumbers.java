package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.ListNode;
import org.junit.Test;

public class IP_G_AddTwoNumbers extends AbstractQuestion {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            l3.next = new ListNode(sum % 10);
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (carry != 0) {
            l3.next = new ListNode(1);
            l3 = l3.next;
        }
        return head.next;
    }

    @Override
    @Test
    public void evaluate() {
        IP_G_AddTwoNumbers test = new IP_G_AddTwoNumbers();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(9);
        ListNode l3 = test.addTwoNumbers(l1, l2);
        System.out.print("l1 := ");
        l1.display();
        System.out.print("l2 := ");
        l2.display();
        System.out.print("Adding two numbers := ");
        l3.display();
    }
}
