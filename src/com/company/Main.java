package com.company;

import com.company.tasks.DeleteMiddleNode;
import com.company.tasks.LinkedListPartion;
import com.company.tasks.Palindrom.IterativePalindrome;
import com.company.tasks.Palindrom.RecursivePalindrome;
import com.company.tasks.Palindrom.SimplePalindrome;
import com.company.tasks.RemoveDuplicates;
import com.company.tasks.SumLists;

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


//        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
//        list.append(10);
//        list.append(13);
//        list.append(20);
//
//        list.append(8);
//        list.append(5);
//        list.append(1);
//        list.append(7);
//
//        LinkedListPartion.listPartition(list.head, 9);

//        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
//        list.append(7);
//        list.append(1);
//        list.append(6);
//
//        MySingleLinkedList<Integer> list2 = new MySingleLinkedList<>();
//
//        list2.append(5);
//        list2.append(9);
//        list2.append(2);
//
//        MySingleLinkedList<Integer> list3 = new MySingleLinkedList<>();
//        var aa = SumLists.SumLists(list.head, list2.head, 0, true, list3);

//        MySingleLinkedList<Integer> list = new MySingleLinkedList<>();
//        list.append(0);
//        list.append(1);
//        list.append(2);
//        list.append(1);
//        list.append(0);

//        boolean result = SimplePalindrome.isPalindrome(list.head);
//        boolean result = IterativePalindrome.isPalindrome(list.head);
//        boolean result = RecursivePalindrome.isPalindrome(list.head);
//        System.out.print(result);

//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        n1.next = n2;
//        ListNode n3 = new ListNode(4);
//        n2.next = n3;
//
//
//        ListNode n4 = new ListNode(1);
//        ListNode n5 = new ListNode(3);
//        n4.next = n5;
//        ListNode n6 = new ListNode(4);
//        n5.next = n6;
//
//        mergeTwoLists(n1, n4);

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        n1.next = n2;
        ListNode n3 = new ListNode(2);
        n2.next = n3;
//        ListNode n4 = new ListNode(3);
//        n3.next = n4;
//        ListNode n5 = new ListNode(3);
//        n4.next = n5;

        var aa = removeDuplicates(n1);

    }

    public static ListNode removeDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null) {
            ListNode inner = current;

            while (inner != null && inner.next != null) {

                if (current.val == inner.next.val) {
                    inner.next = inner.next.next;
                }
                inner = inner.next;
            }

            current = current.next;
        }

        return head;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l2 == null) {
            return l1;
        } else if (l1 == null) {
            return l2;
        }


        ListNode l3 = new ListNode();
        var start = l3;

        while (l1 != null || l2 != null) {

            if (l1 != null && (l2 == null || l1.val <= l2.val)) {
                l3.val = l1.val;
                l1 = l1.next;
            } else if (l2 != null || (l1 == null || l2.val < l1.val)) {
                l3.val = l2.val;
                l2 = l2.next;
            }

            if (l1 != null || l2 != null) {
                l3.next = new ListNode();
                l3 = l3.next;
            }
        }

        return start;
    }


}

