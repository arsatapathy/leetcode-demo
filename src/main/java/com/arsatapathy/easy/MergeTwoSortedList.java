package com.arsatapathy.easy;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        MyList list1 = new MyList();

        list1.add(9);
        list1.add(8);
        list1.add(4);
        list1.add(1);
        list1.add(2);

        list1.print();

        System.out.println();

        MyList list2 = new MyList();

        list2.add(5);
        list2.add(3);
        list2.add(7);
        list2.add(10);
        list2.add(6);

        list2.print();

        System.out.println();

        System.out.println(list1.mergeTwoLists(list1.getHead(), list2.getHead()));
    }
}

class MyList {
    private ListNode head;
    private int length;

    public ListNode getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void add(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        } else if (head.val > data) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;

            while (current.next != null) {
                if (current.next.val > data) {
                    break;
                }
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
            length++;
        }
    }

    public void print() {
        if (head == null)
            return;
        else {
            ListNode current = head;

            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        } else {

            if (list1 == null) {
                return list2;
            }

            if (list2 == null) {
                return list1;
            }

            ListNode newHead = null;

            ListNode newCurrent = null;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    if (newHead == null) {
                        newHead = new ListNode(list1.val);
                        newCurrent = newHead;
                    } else {
                        newCurrent.next = new ListNode(list1.val);
                        newCurrent = newCurrent.next;
                    }
                    list1 = list1.next;
                } else {
                    if (newHead == null) {
                        newHead = new ListNode(list2.val);
                        newCurrent = newHead;
                    } else {
                        newCurrent.next = new ListNode(list2.val);
                        newCurrent = newCurrent.next;
                    }
                    list2 = list2.next;
                }

            }

            while (list1 != null) {

                newCurrent.next = new ListNode(list1.val);
                newCurrent = newCurrent.next;

                list1 = list1.next;
            }

            while (list2 != null) {

                newCurrent.next = new ListNode(list2.val);
                newCurrent = newCurrent.next;

                list2 = list2.next;
            }

            return newHead;
        }

    }
}

class ListNode {
    int val;
    ListNode next;


    ListNode(int data) {
        this.val = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ",next=" + next + "}";
    }
}
