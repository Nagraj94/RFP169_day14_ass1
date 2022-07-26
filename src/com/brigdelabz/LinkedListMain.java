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
            System.out.println("element is not found and inserted");
        }
        linkedList1.insert(30,40);
        linkedList1.print();
        System.out.println(" ");
        System.out.println("deleting element");
        linkedList1.pop();
        linkedList1.print();

        System.out.println(" ");
        System.out.println("delete from last");
        linkedList1.remove();
        linkedList1.print();

        System.out.println("");
        System.out.println("stack operation");
        Stack stack1 = new Stack();
        stack1.push(56);
        stack1.push(30);
        stack1.push(70);
        stack1.push(90);
        stack1.print();

    }

}
