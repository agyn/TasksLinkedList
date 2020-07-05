package com.company;

public class MyDoubleLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int length = 0;

    public void append(String value) {
        var newNode = new DoubleNode(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }

        tail = newNode;
        length++;
    }

    public void prepend(String value) {
        var newNode = new DoubleNode(value);

        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    public void insert(String value, int index) {
        if (index > length) {
            throw new IndexOutOfBoundsException();
        }

        var newNode = new DoubleNode(value);
        var beforeNode = traverseToIndex(index - 1);
        var replacedNode = beforeNode.next;

        beforeNode.next = newNode;
        newNode.next = replacedNode;
        newNode.previous = beforeNode;
        replacedNode.previous = newNode;

        length++;
    }

    private DoubleNode traverseToIndex(int index) {
        int counter = 0;
        var current = head;

        while (counter != index) {
            current = current.next;
            counter++;
        }

        return current;
    }

    public void remove(int index) {
        var beforeNode = traverseToIndex(index -1);

        var nodeForDelete = beforeNode.next;
        beforeNode.next = nodeForDelete.next;
        nodeForDelete.next.previous = beforeNode;
    }

}

