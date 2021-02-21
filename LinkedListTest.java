package com.luv2code;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(6);

        System.out.println("Linked list before removing DUPLICATES is : " + linkedList);

        linkedList = removeDuplicatesFromLinkedList(linkedList);

        System.out.println("Linked list AFTER removing DUPLICATES is : " + linkedList);
    }

    private static LinkedList<Integer> removeDuplicatesFromLinkedList(LinkedList<Integer> linkedList) {

        if (!linkedList.isEmpty() && linkedList.size() > 1) {
            for (int i=1; i < linkedList.size(); i++) {
                if (linkedList.get(i-1) == linkedList.get(i)) {
                    linkedList.remove(i);
                    System.out.println(linkedList);
                    i--;
                }
            }
        }
        return linkedList;
    }




}
