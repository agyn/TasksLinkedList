package com.company.tasks;

import com.company.SingleNode;

/*
Delete Middle Node: Implement an algorithm to delete a node in the middle (Le., any node but
the fi rst and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node
 */
public class DeleteMiddleNode {
    public static void deleteMiddleNode(SingleNode<Integer> node) {
        if (node == null || node.next == null) {
            throw new NullPointerException();
        }

        var nextNode = node.next;
        node._value = nextNode._value;
        node.next = nextNode.next;
    }
}
