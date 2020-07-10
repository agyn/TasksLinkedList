package com.company.tasks.Palindrom;

import com.company.MySingleLinkedList;
import com.company.SingleNode;

public class SimplePalindrome {
    public static boolean isPalindrome(SingleNode<Integer> head) {
        var reversed = reverse(head);
        return isEqual(reversed, head);
    }

    private static SingleNode<Integer> reverse(SingleNode<Integer> node) {
        SingleNode<Integer> head = null;
        while (node != null) {
            var newNode = new SingleNode<Integer>(node._value);
            newNode.next = head;
            head = newNode;
            node = node.next;
        }

        return head;
    }

    private static boolean isEqual(SingleNode<Integer> reversedNode, SingleNode<Integer> node) {
        while(reversedNode != null && node != null) {
            if (reversedNode._value != node._value) {
                return false;
            }

            reversedNode = reversedNode.next;
            node = node.next;
        }

        return reversedNode == null && node == null;
    }

}
