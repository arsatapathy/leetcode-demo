package com.arsatapathy.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbersTest {

    @Test
    public void test_01() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(1))));

        ListNode sumNode = AddTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> actualList = new LinkedList<>();

        while (sumNode != null) {
            actualList.add(sumNode.val);
            sumNode = sumNode.next;
        }

        Assertions.assertEquals(List.of(7, 0, 1, 2), actualList);

    }

    @Test
    public void test_02() {
        ListNode l1 = new ListNode(9,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9)))))));

        ListNode l2 = new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9))));

        ListNode sumNode = AddTwoNumbers.addTwoNumbers(l1, l2);

        List<Integer> actualList = new LinkedList<>();

        while (sumNode != null) {
            actualList.add(sumNode.val);
            sumNode = sumNode.next;
        }

        Assertions.assertEquals(List.of(8, 9, 9, 9, 0, 0, 0, 1), actualList);

    }
}
