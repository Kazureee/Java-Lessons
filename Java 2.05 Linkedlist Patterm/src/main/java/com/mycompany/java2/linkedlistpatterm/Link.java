package com.mycompany.java2.linkedlistpatterm;

import java.util.*;

class Link {
    Node head;
    Node tail;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    Link() {
        head = null;
        tail = null;
    }

    // Method to prepend a value to the linked list
    void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

    // Method to append a value to the linked list
    void append(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void prependAt(int position, int value) {
    if (position <= 0) {
        prepend(value);
    } else {
        Node newNode = new Node(value);
        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
            if (tail == current) {
                tail = newNode;
            }
        } else {
            append(value);
        }
    }
}
    
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Link link = new Link();

        // Assign values to the linked list using the prepend method
        link.prepend(10);
        link.prepend(8);
        link.prepend(6);
        link.prepend(4);
        link.prepend(2);

        
        System.out.print("Linked list : ");
        link.printList();

        
        link.prepend(1);
        link.prepend(0);

        
        System.out.print("After adding the value at the beginning, the list is: ");
        link.printList();
        
        link.append(11);
        link.append(12);
        
        System.out.print("After adding the value at the end, the list is: ");
        link.printList();
        
        link.prependAt(2, 3);

        System.out.print("Linked List after adding values and inserting 3: ");
        link.printList();
    }
}
