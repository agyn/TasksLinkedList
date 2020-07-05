package com.company;

import com.company.tasks.DeleteMiddleNode;
import com.company.tasks.LinkedListPartion;
import com.company.tasks.RemoveDuplicates;

import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        HashMap<String, String> map = new HashMap<>();
//        LinkedList list = new LinkedList();
//        list.get(2);

//        LinkedList<Integer> list = new LinkedList<>();
//        list.add(1);
////        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        RemoveDuplicates.removeDuplicates(list);

//        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
//        list.append(1);
//        list.append(1);
//        list.append(1);
//        list.append(1);
//        list.append(2);
//        list.append(2);
//        list.append(3);
//        list.append(3);
//        list.append(4);
//        list.append(5);

//        RemoveDuplicates.myRemoveDuplicates(list.head);
//        RemoveDuplicates.myRemoveDuplicatesON2(list.head);

//        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
//        list.append(1);
//        list.append(2);
//        list.append(3);
//        list.append(4);
//        list.append(5);
//        list.append(6);
//
//        DeleteMiddleNode.deleteMiddleNode(list.get(2));


        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
        list.append(10);
        list.append(13);
        list.append(20);

        list.append(8);
        list.append(5);
        list.append(1);
        list.append(7);

        LinkedListPartion.listPartition(list.head, 9);


    }

}