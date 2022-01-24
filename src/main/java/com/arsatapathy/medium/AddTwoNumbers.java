package com.arsatapathy.medium;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = null;
        ListNode newNode = null;

        ListNode cur1 = l1;
        ListNode cur2 = l2;

        int carry = 0;
        int sum = 0;

        while (cur1 != null && cur2 != null) {

            sum = cur1.val + cur2.val + carry;

            if (sum >= 10) {
                carry = sum / 10;
                sum = sum - carry * 10;
            } else
                carry = 0;

            newNode = new ListNode(sum);

            if (sumNode == null) {
                sumNode = newNode;
            } else {
                ListNode current = sumNode;

                while (current.next != null) current = current.next;

                current.next = newNode;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        while (cur1 != null) {

            sum = cur1.val + carry;

            if (sum >= 10) {
                carry = sum / 10;
                sum = sum - carry * 10;
            } else
                carry = 0;

            newNode = new ListNode(sum);

            if (sumNode == null) {
                sumNode = newNode;
            } else {
                ListNode current = sumNode;

                while (current.next != null) current = current.next;

                current.next = newNode;
            }

            cur1 = cur1.next;
        }

        while (cur2 != null) {

            sum = cur2.val + carry;

            if (sum >= 10) {
                carry = sum / 10;
                sum = sum - carry * 10;
            } else
                carry = 0;

            newNode = new ListNode(sum);

            if (sumNode == null) {
                sumNode = newNode;
            } else {
                ListNode current = sumNode;

                while (current.next != null) current = current.next;

                current.next = newNode;
            }

            cur2 = cur2.next;
        }

        if (carry != 0) {
            newNode = new ListNode(carry);

            ListNode current = sumNode;

            while (current.next != null) current = current.next;

            current.next = newNode;

        }

        return sumNode;
    }

}
