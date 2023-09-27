/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java2.linkedlistpattern2;

/**
 *
 * @author Charles
 */
import java.util.*;
public class Java26LinkedListPattern2 {

    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(2);
        num.add(4);
        num.add(6);
    
        System.out.println("Here are the initial values: " + num);
        
        int index = num.indexOf(4);
        num.add(index, 5);
        
        System.out.println("Now inserting the value 5: " + num);
        
        num.removeLast();
        System.out.println("Now deleting the last node: " + num);

    
    }
}
