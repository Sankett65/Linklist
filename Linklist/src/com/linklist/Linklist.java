package com.linklist;

public class Linklist {
    Node head;
    int size=0;

   public void addFirst(int data){
       Node newNode = new Node(data);
       if (head == null){
           head = newNode;
           return;
       }
       newNode.next=head;
       head = newNode;
   }

   public void addLast(int data){
       Node newNode=new Node(data);
       if (head==null){
           head = newNode;
           return;
       }
       Node temp =head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=newNode;
   }

   public void size(){
       Node temp=head;
       while (temp!=null){
           size++;
           temp=temp.next;
       }
       System.out.println(size);
   }

   public void insert(int data,int index){
       if (index==0){
           addFirst(data);
           return;
       }
       if (index==size){
           addLast(data);
           return;
       }
       Node temp =head;
       for (int i=1;i<index;i++){
             temp=temp.next;
         }
       Node newNode = new Node(data,temp.next);
         temp.next=newNode;
   }


   public void deleteFirst(){
       if (head ==null){
           System.out.println("Empty'");
       }
         head=head.next;
   }

   public void deleteLast(){
       if (head==null){
           System.out.println("Empty");
       }
       Node secondLast=head;
       Node  last=head.next;
      while (last.next!=null){
          last=last.next;
          secondLast=secondLast.next;
      }
      secondLast.next=null;
   }

   public void find(int data){
       Node temp =head;
       int index=-1;
       while (temp!=null){
           index++;
           if (temp.number==data){
               System.out.println("\nElement is found");

               break;
           }
           temp=temp.next;

       }
       System.out.println("\nIndex position is "+index);
   }

   public void insertAtParticularPosition(int data,int element) {
       Node temp = head;
       int index = 0;
       while (temp.next != null) {
           index++;
           if (temp.number == element) {
               break;
           }
           temp = temp.next;
       }
       System.out.println("\nIndex position is " + index);
       insert(data ,index);

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
