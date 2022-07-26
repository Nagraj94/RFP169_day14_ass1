package com.brigdelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        System.out.println("adding element from back ");
//        linkedList.addBack(70);
//        linkedList.addBack(30);
//        linkedList.addBack(56); //head
//        linkedList.print();  //56->30->70->

        System.out.println(" ");
        System.out.println("appending ");
        linkedList.append(70);
        linkedList.append(30);
        linkedList.append(56);
        linkedList.print();  //70->30->56->

    }
}
