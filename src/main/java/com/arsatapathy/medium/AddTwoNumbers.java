package com.arsatapathy.medium;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = null;
        ListNode current = null;

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        int carry = 0;
        int sum = 0;

        while (cur1 != null || cur2 != null) {
            sum = ((cur1 != null) ? cur1.val : 0) + ((cur2 != null) ? cur2.val :0) + carry;
            carry = sum / 10;

            if (current == null) {
                sumNode = new ListNode(sum % 10);
                current = sumNode;
            } else {
                current.next = new ListNode(sum %10);
                current = current.next;
            }

            if (cur1 != null) cur1 = cur1.next ;
            if (cur2 != null) cur2 = cur2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return sumNode;
    }

}
