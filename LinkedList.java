package com.luv2code;

import java.util.*;

public class LinkedList {
    LinkedListNode head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 1);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 4);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 6);

        System.out.print("Linkedlist added is : ");
        printList(list);
        System.out.println("\n");

        removeDuplicatesFromLinkedList(list);
        System.out.print("Linkedlist after removing dupiicates  is : ");
        printList(list);
    }

    private static LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        if (linkedList != null) {
            LinkedListNode currentNode = linkedList.head;
            LinkedListNode nextNode = currentNode.next;

        while (currentNode.next != null) {
            if (currentNode.value == nextNode.value) {
                currentNode.next = nextNode.next;
                nextNode = nextNode.next;
            } else {
                currentNode = nextNode;
                nextNode = nextNode.next;
            }
        }
        }

        return linkedList;
    }

    private static void printList(LinkedList list) {
        LinkedListNode last = list.head;

            while (last != null) {
                System.out.print(last.value + " ");
                last = last.getNext();
            }
    }

    private static LinkedList insert(LinkedList list, int value) {
        LinkedListNode new_node = new LinkedListNode(value);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
 //           System.out.println("testIf" + list.head);
        } else {
            LinkedListNode last = list.head;
            while (last.getNext() != null) {
                //assign  next in linked list object reference
                last = last.getNext();
 //               System.out.println("test1" + last);
            }
            last.next = new_node;
        }
        return list;

    }



}
/*
    LinkedListNode head;

    public static void main(String[] args) {
        //initialize Linked list
        LinkedList list = new LinkedList();

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        //print the linkedlist
        printList(list);
    }

    private static LinkedList insert(LinkedList list, int value) {
        // Create a new node
        LinkedListNode new_node = new LinkedListNode(value);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {
            //traverse to end and insert new_node at end

                LinkedListNode last = list.head;
            while (last.getNext() != null) {
//                last.next = last.getNext();
                last = last.getNext();
            }
            last.next = new_node;
        }
    return list;
    }

    private static void printList(LinkedList list) {

        LinkedListNode currNode = list.head;
        System.out.print("Linkedlist is : ");

        //traverse linkedlist
        while (currNode != null) {
            System.out.print(currNode.value + " ");
            currNode = currNode.getNext();
//            currNode.value = currNode.getValue();
        }
    }
*/


//}



//import java.io.*;

// Java program to implement
// a Singly Linked List
/*public class LinkedList {

    Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    // Method to print the LinkedList.
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currNode != null) {
            // Print the data at current node
            System.out.print(currNode.data + " ");

            // Go to next node
            currNode = currNode.next;
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        *//* Start with the empty list. *//*
        LinkedList list = new LinkedList();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
    }
}*/
