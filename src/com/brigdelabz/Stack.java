package com.brigdelabz;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }
    public void push(int data) {
        linkedList.addBack(data);
    }
    public void pop(){
        linkedList.pop();
    }
    public void print(){
        linkedList.print();
    }
}
