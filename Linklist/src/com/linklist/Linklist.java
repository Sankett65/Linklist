package com.linklist;

public class Linklist {
    Node head;
    int size;

   public void addFirst(int data){
       Node newNode = new Node(data);
       if (head == null){
           head = newNode;
           return;
       }
       newNode.next=head;
       head = newNode;
       size++;
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
       size++;
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
         size++;
   }


   public void deleteFirst(){
       if (head ==null){
           System.out.println("Empty'");
       }
         head=head.next;
       size--;
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
      size--;
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
       int index=0;
       while (temp!=null){
           index++;
           if (temp.number==element){
               break;
           }
           temp=temp.next;
       }
       Node newNode = new Node(data,temp.next);
       temp.next=newNode;
   }

   public int get(int index){
       int temp1 = 0;
      if (size==0){
          System.out.println("Empty");
        //  return -1;
      } else if (index<0 || index>=size) {
          System.out.println("Invalid");
        //  return -1;
      }else {
          Node temp=head;
          for (int i=0;i<index;i++){
              temp=temp.next;
          }
          temp1= temp.number;
      }
       System.out.println(temp1);
       return temp1;
   }

   public void delete(int data){
       Node temp =head;
       while (temp.next.number!=data){
           temp=temp.next;
       }
     temp.next=temp.next.next;
       temp=null;
   }

   public void sort(){

       Node temp=head;
       Node index=null;
       int temp1;
       if (head==null){
           return;
       }else {
           while (temp!=null){
               index=temp.next;
               while (index!=null){
                   if (temp.number>index.number){
                       temp1=temp.number;
                       temp.number=index.number;
                       index.number=temp1;
                   }
                   index=index.next;
               }
               temp=temp.next;
           }
       }
//     int size=0;
//   if (head!=null) {
//       Node temp =head;
//       while (temp != null) {
//           temp = temp.next;
//           size++;
//       }
//   }
//       //System.out.println(size);
//
//     for (int i =0;i<size;i++){
//         for (int j=0;j<size-i-1;j++){
//             Node temp=head;
//             Node temp1=temp.next;
//             int s;
//             if (temp.number>temp1.number){
//                 s = temp.number;
//                 temp1.number=temp.number;
//                 temp.number=s;
//             }
//             temp=temp1;
//             temp1=temp1.next;
//         }
//     }
//     Node temp2=head;
//     while(temp2!=null){
//         System.out.print("\n"+temp2.number);
//         temp2=temp2.next;
//     }

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
