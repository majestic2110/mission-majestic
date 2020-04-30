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

}
