package com.company;

public class MySingleLinkedList<T> {
    public SingleNode<T> head;
    public SingleNode<T> tail;
    public int length = 0;


    public void append(T value) {
        SingleNode<T> newNode = new SingleNode<>(value);

        if (length == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        length++;

    }

    public void prepend(T value) {
        SingleNode<T> newNode = new SingleNode<>(value);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(int index, T value) {
        if (index > length) {
            throw new IndexOutOfBoundsException();
        }

        SingleNode<T> newNode = new SingleNode<>(value);
        SingleNode<T> currentNode = traverseToIndex(index - 1);
        SingleNode<T> holdingPointer = currentNode.next;
        currentNode.next = newNode;
        newNode.next = holdingPointer;
        length++;
    }

    public SingleNode<T> traverseToIndex(int index) {
        int counter = 0;
        SingleNode<T> current = head;

        while (counter != index) {
            current = current.next;
            counter++;
        }

        return current;
    }

    public void remove(int index) {
        var currentNode = traverseToIndex(index - 1);
        var nodeForDelete = currentNode.next;
        currentNode.next = nodeForDelete.next;
        length--;
    }

    public SingleNode<T> get(int index) {
        return traverseToIndex(index);
    }

}
