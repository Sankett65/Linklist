package com.linklist;

public class LinklistMain {
    public static void main(String[] args) {
        System.out.println("Creating Linklist");
        Linklist l = new Linklist();

        //  Creating Simple Linklist
//        l.addFirst(56);
//        l.addFirst(30);
//        l.addFirst(70);
//
//        l.print();

        //   Using addFirst method to add the element at first position
//        l.addFirst(70);
//        l.addFirst(30);
//        l.addFirst(56);
//        l.print();

        //   Using addlast method to add the element at the last position
//        l.addFirst(56);
//        l.addLast(30);
//        l.addLast(70);
//
//        l.print();


        //   Inserting 30 between 56 and 70
//        l.addFirst(70);
//        l.addFirst(56);
//        l.size();
//       l.insert(30,1);
//
//        l.print();


        l.addFirst(70);
        l.addFirst(30);
        l.addFirst(56);
        l.print();
        System.out.println();
        l.deleteFirst();
        l.print();
    }
}
