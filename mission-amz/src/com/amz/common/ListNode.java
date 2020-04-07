package com.amz.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public void display() {
        ListNode curr = this;
        while (curr != null) {
            System.out.print(curr.val);
            curr = curr.next;
            if (curr != null) {
                System.out.print(" -> ");
            }
        }
        System.out.print("\n");
    }
}
