package com.linklist;

public class Linklist {
    Node head;

   public void addFirst(int data){
       Node newNode = new Node(data);
       if (head == null){
           head = newNode;
           return;
       }
       newNode.next=head;
       head = newNode;
   }

   public void print(){
       if (head==null){
           System.out.println("Empty");
       }
       Node temp = head;
       while (temp!=null){
           System.out.print(temp.number+"-->");
           temp=temp.next;
       }

   }
}
