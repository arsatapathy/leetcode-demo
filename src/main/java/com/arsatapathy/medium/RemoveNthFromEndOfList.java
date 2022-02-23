package com.arsatapathy.medium;

public class RemoveNthFromEndOfList {

    public static ListNode remove(ListNode head, int n) {
        ListNode current = head;
        int length = 0;


        while(current != null) {
            length++;
            current = current.next;
        }

        ListNode newCurrent = head;
        ListNode previous = null;

        for (int i = 0; i < length - n; i++) {
            previous = newCurrent;
            newCurrent = newCurrent.next;
        }

        if (previous == null) {
            head = head.next;
        } else {
            previous.next = newCurrent.next;
        }

        return head;
    }
}
