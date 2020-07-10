package com.company.tasks.Palindrom;

import com.company.SingleNode;

import java.util.Stack;

public class IterativePalindrome {

    public static boolean isPalindrome(SingleNode<Integer> head) {
        SingleNode<Integer> slow = head;
        SingleNode<Integer> fast = head;

        Stack<Integer> stack = new Stack<Integer>();

        while (fast != null && fast.next != null) {
            stack.push(slow._value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            Integer temp =  stack.pop();
            if(temp != slow._value){
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

}
