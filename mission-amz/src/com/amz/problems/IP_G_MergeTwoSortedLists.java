package com.amz.problems;

import com.amz.common.AbstractQuestion;
import com.amz.common.ListNode;

public class IP_G_MergeTwoSortedLists extends AbstractQuestion {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode l3 = new ListNode(0);
        ListNode dummyHead = l3;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (l1 != null) {
            l3.next = l1;
        } else if (l2 != null) {
            l3.next = l2;
        }
        return dummyHead.next;
    }

    @Override
    public void simulate() {
        IP_G_MergeTwoSortedLists test = new IP_G_MergeTwoSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(5);
        l1.next.next.next.next = new ListNode(6);
        System.out.print("l1 := ");
        l1.display();
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);
        l2.next.next.next = new ListNode(7);
        l2.next.next.next.next = new ListNode(9);
        System.out.print("l2 := ");
        l2.display();
        ListNode l3 = mergeTwoLists(l1, l2);
        System.out.print("Merged Sorted List := ");
        l3.display();
    }
}
