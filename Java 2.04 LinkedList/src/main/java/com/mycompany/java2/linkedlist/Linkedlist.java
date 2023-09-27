package com.mycompany.java2.linkedlist;

import java.util.LinkedList;

/**
 *
 * @author Charles
 */

//Linkedlist Implementation
class Linkedlist {
    //Creating a Node
    Node head;
    
    static class Node{
    int value;
    Node next;
    
    Node (int d){
    value = d;
    next = null;
    
    }
    }
    
    public static void main(String[] args){
    Linkedlist link = new Linkedlist();
    
    
    //assign value values
    link.head = new Node(1);
    Node Second = new Node(2);
    Node Third = new Node(3);

    
    //Connect Nodes
    link.head.next = Second;
    Second.next = Third;
    
    //Printing Variable
    while (link.head != null) {
        System.out.print(link.head.value + " ");
        link.head = link.head.next; 
        }
    }
}