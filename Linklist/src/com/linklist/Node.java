package com.linklist;

public class Node {

    int number;
    Node next;
    public Node(int number) {
        this.number = number;
    }

    public Node(int number,Node next) {
        this.number = number;
        this.next = next;
    }
}
