package com.company.tasks;

import com.company.SingleNode;

public class LinkedListPartion {

    public static void listPartition(SingleNode<Integer> node, int x) {
        SingleNode<Integer> before = new SingleNode<>(null);
        SingleNode<Integer> after = new SingleNode<>(null);
        SingleNode<Integer> beforeStart = new SingleNode<>(null);
        SingleNode<Integer> afterStart = new SingleNode<>(null);

        while (node != null) {
            if (node._value < x) {
                if(before.next == null){
                    beforeStart = node;
                }
                before.next = node;
                before = node;

            } else if (node._value > x) {
                if(after.next == null){
                    afterStart = node;
                }
                after.next = node;
                after = node;

            }

            node = node.next;
        }

        after.next = null;
        before.next = afterStart;

        while (beforeStart.next!= null){
            System.out.print(beforeStart._value);

            beforeStart = beforeStart.next;
        }

    }
}
