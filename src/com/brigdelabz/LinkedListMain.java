package com.brigdelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
//        System.out.println("adding element from back ");
//        linkedList.addBack(70);
//        linkedList.addBack(30);
//        linkedList.addBack(56); //head
//        linkedList.print();  //56->30->70->

        System.out.println(" ");
        System.out.println("appending ");
        linkedList1.append(70);
        linkedList1.append(30);
        linkedList1.append(56);
        linkedList1.print();  //70->30->56->

        System.out.println(" ");
        if (linkedList1.search(30) != null){
            System.out.println("element is found");
        }
        else{
            System.out.println("element is not found");
        }
        linkedList1.insert(30,40);
        linkedList1.print();
    }
}
