package com.arsatapathy.medium;

import org.junit.jupiter.api.Test;

public class RemoveNthFromEndOfListTest {

    @Test
    public void test_01() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        System.out.println(RemoveNthFromEndOfList.remove(l1, 1));
    }

    @Test
    public void test_02() {
        ListNode l1 = new ListNode(2);

        System.out.println(RemoveNthFromEndOfList.remove(l1, 1));
    }

    @Test
    public void test_03() {
        ListNode l1 = new ListNode(1, new ListNode(2));

        System.out.println(RemoveNthFromEndOfList.remove(l1, 2));
    }

    @Test
    public void test_04() {
        ListNode l1 = new ListNode(1, new ListNode(2));

        System.out.println(RemoveNthFromEndOfList.remove(l1, 1));
    }

    @Test
    public void test_05() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        System.out.println(RemoveNthFromEndOfList.remove(l1, 3));
    }
}
