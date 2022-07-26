package com.brigdelabz;

public class LinkedList {
    Node head;
    Node tail;

    public void addBack(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }
    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
    }
   public Node search(int searchData){
        Node temp = head;
        while (temp != null){
            if (temp.data == searchData){
                return temp;
            }
            temp = temp.next;
        }
       return null;
   }
   public boolean insert(int searchData, int insertData){
      Node newNode = new Node(insertData);
      Node searchNode = search(searchData);
      if (searchNode != null){
          newNode.next = searchNode.next;
          searchNode.next = newNode;
          return true;
      }
      return false;
   }
   public int pop(){
      int deleteData = head.data;
      head = head.next;
      return deleteData;
   }
   public int remove(){
        int deleteData = tail.data;
        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return deleteData;
   }
    public void print(){
        Node temp = head;
        while (temp != null){

            System.out.print(temp.data+"->");
            temp = temp.next;
        }
    }

}
