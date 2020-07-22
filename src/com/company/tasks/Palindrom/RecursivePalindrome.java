package com.company.tasks.Palindrom;

import com.company.SingleNode;

public class RecursivePalindrome {
    public static boolean isPalindrome(SingleNode<Integer> head) {
        int length = getLength(head);
        return recursePalindrome(head, length)._result;
    }

    private static Result recursePalindrome(SingleNode<Integer> node, int length) {
        if (node == null || length <= 0) {
            return new Result(node, true);
        } else if (length == 1) {
            return new Result(node.next, true);
        }

        Result res = recursePalindrome(node.next, length -2);

        if(!res._result || res._node == null){
            return res;
        }

        res._result = (node._value == res._node._value);

        res._node = res._node.next;

        return res;
    }

    private static int getLength(SingleNode<Integer> node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }

        return length;
    }

}

class Result {
    public SingleNode<Integer> _node;
    public boolean _result;

    public Result(SingleNode<Integer> node, boolean result) {
        _node = node;
        _result = result;
    }
}
