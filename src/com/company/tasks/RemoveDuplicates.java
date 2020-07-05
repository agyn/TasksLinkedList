package com.company.tasks;

import com.company.MySingleLinkedList;
import com.company.SingleNode;

import java.util.HashMap;
import java.util.LinkedList;

public class RemoveDuplicates {

    public static void removeDuplicates(LinkedList<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        var iterator = list.iterator();

        while (iterator.hasNext()) {
            var number = iterator.next();
            if (!map.containsKey(iterator)) {
                map.put(number, number);
            }
        }

        var mapIterator = map.entrySet().iterator();
        LinkedList<Integer> newList = new LinkedList<>();

        while (mapIterator.hasNext()) {
            newList.add(mapIterator.next().getValue());
            mapIterator.hasNext();
        }

        var printIterator = newList.iterator();

        while (printIterator.hasNext()) {
            System.out.print(printIterator.next() + ", ");
        }

    }

    //Solutions with my LinkedList
    public static void myRemoveDuplicates(SingleNode<Integer> node) {
        HashMap<Integer, Integer> map = new HashMap<>();

        SingleNode<Integer> newNode = null;
        SingleNode<Integer> printNode = null;

        while (node.next != null) {
            if (map.containsKey(node._value)) {
                newNode.next = node.next;
            } else {
                if(map.size() == 0){
                    printNode = node;
                }
                map.put(node._value, node._value);
                newNode = node;
            }

            node = node.next;
        }

        while(printNode != null){
            System.out.print(printNode._value + ", ");
            printNode = printNode.next;
        }

    }

    //Solutions with my LinkedList
    public static void myRemoveDuplicatesON2(SingleNode<Integer> node) {

        while (node.next != null) {

            var runner = node;

            while(runner.next != null) {
                if(node._value == runner.next._value){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }

            node = node.next;
        }

        while(node != null){
            System.out.print(node._value + ", ");
            node = node.next;
        }

    }
}
