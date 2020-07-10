package com.company;

public class SingleNode<T> {
    public SingleNode<T> next;
    public T _value;

    public SingleNode(T value){
        _value = value;
    }

    public SingleNode(){
    }
}
