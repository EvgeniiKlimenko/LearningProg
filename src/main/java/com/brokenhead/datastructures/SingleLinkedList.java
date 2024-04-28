package com.brokenhead.datastructures;

public class SingleLinkedList {
    private ListNode head;

    public void add(int value) {
        ListNode newNode = new ListNode(value);
        if(this.isEmpty()) {
            head = newNode;
            return;
        }

        ListNode iterationNode = head;
        while (iterationNode.getNext() != null) {
            iterationNode = iterationNode.getNext();
        }
        iterationNode.setNext(newNode);
    }

    public void remove(int value) {
        if(this.isEmpty()) {
            return;
        }

        ListNode previousNode = null;
        ListNode iterationNode = head;
        boolean isFound = false;

        while (iterationNode.getNext() != null) {
            if(iterationNode.getValue() == value) {
                isFound = true;
                break;
            }
            previousNode = iterationNode;
            iterationNode = iterationNode.getNext();
        }

        if (isFound) {
            previousNode.setNext(iterationNode.getNext());
        }
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void reverseList() {
        if(head.getNext() == null) {
            return;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.getNext();

        while (current.getNext() != null) {
            // first - save next.getNext element
            ListNode newNext = next.getNext();

            // reset links: current -> prev; next -> current
            current.setNext(prev);
            next.setNext(current);

            // move pointers forward:
            prev = current;
            current = next;
            if(newNext == null) { // ... but check if we reach the end of the initial list for next
                break;
            }
            next = newNext;
        }
        // last element after while() should be next == last element
        this.head = next;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        ListNode iterationNode = head;
        while (iterationNode.getNext() != null) {
            string.append(" -> ");
            string.append(iterationNode.getValue());
            iterationNode = iterationNode.getNext();
        }
        string.append(" -> ");
        string.append(iterationNode.getValue());
        return string.toString();
    }
}
