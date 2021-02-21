package com.luv2code;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class LinkedListNode {

    public int value;
    public LinkedListNode next;

    public LinkedListNode (int value) {
        this.value = value;
        this.next = null;
    }

/*    public int value;
    public LinkedListNode next;

    public LinkedListNode (int value) {
        this.value = value;
        this.next = null;
    }*/




    public int getValue() {
        return value;
    }

    public LinkedListNode getNext() {
        return next;
    }
}
