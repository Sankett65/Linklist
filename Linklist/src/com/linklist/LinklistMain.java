package com.linklist;

public class LinklistMain {
    public static void main(String[] args) {
        System.out.println("Creating Linklist");
        Linklist l = new Linklist();
//        l.addFirst(56);
//        l.addFirst(30);
//        l.addFirst(70);
//
//        l.print();

//        l.addFirst(70);
//        l.addFirst(30);
//        l.addFirst(56);
//        l.print();

        l.addFirst(56);
        l.addLast(30);
        l.addLast(70);

        l.print();
    }
}
