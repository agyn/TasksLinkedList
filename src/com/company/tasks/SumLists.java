package com.company.tasks;

import com.company.MySingleLinkedList;
import com.company.SingleNode;

public class SumLists {
    public static SingleNode<Integer> SumLists(SingleNode<Integer> node1,
                                               SingleNode<Integer> node2, int carry, boolean isFirst,
                                               MySingleLinkedList<Integer> check) {
        if (node1 == null || node2 == null) {
            return null;
        }

        SingleNode<Integer> resultNode = new SingleNode<Integer>();

        if(isFirst == true){
            check.head = resultNode;
            isFirst = false;
        }

        int value = carry;

        if (node1 != null) {
            value += node1._value;
        }

        if (node2 != null) {
            value += node2._value;
        }

        resultNode._value = value % 10;

        if (node1 != null && node2 != null) {
            SingleNode<Integer> more = SumLists(
                    node1 == null ? null : node1.next,
                    node2 == null ? null : node2.next,
                    value >= 10 ? 1 : 0, false, check);

            resultNode.next = more;
        }

        return resultNode;

    }
}
