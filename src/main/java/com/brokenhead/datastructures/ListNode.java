package com.brokenhead.datastructures;

public class ListNode {

    private int value;
    private ListNode next;

    ListNode(int value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return this.next;
    }

    public int getValue() {
        return this.value;
    }
}
