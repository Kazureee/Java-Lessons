package com.mycompany.binary_tree;
import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Binary_Tree {
    Node root;
    Scanner  input = new Scanner(System.in);
    
    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.left);
            System.out.print(node.key + " "); 
            traverseTree(node.right);
        }
    }
    
    public void insertNode(Node node, int value) {
    if (value < node.key) {
        if (node.left != null) {
            insertNode(node.left, value);
        } else {
            node.left = new Node(value);
        }
    } else if (value > node.key) { 
        if (node.right != null) {
            insertNode(node.right, value);
        } else {
            node.right = new Node(value);
        }
    }
}
        public int getHeight() {
        return calculateHeight(root);
    }

        private int calculateHeight(Node node) {
        if (node == null) {
            return -1;
        }

        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    public static void main(String[] args) {
        Binary_Tree tree = new Binary_Tree();
        
        System.out.println("Enter the value of the root node: ");
        int rootValue = tree.input.nextInt();
        tree.root = new Node(rootValue);
        
        System.out.println("Enter the value of the left node: ");
        int leftValue = tree.input.nextInt();
        tree.root.left = new Node(leftValue);
        
        System.out.println("Enter the value of the right node: ");
        int rightValue = tree.input.nextInt();
        tree.root.right = new Node (rightValue);
        
        char choice;
        do {
            System.out.println("Do you want to add another node Y/N?");
            choice = Character.toLowerCase(tree.input.next().charAt(0)); // Convert choice to lowercase

            if (choice == 'y') {
                System.out.println("Enter the value of the new node: ");
                int nodeValue = tree.input.nextInt();
                tree.insertNode(tree.root, nodeValue);
            } else if (choice == 'n') { 
                System.out.print("Binary Tree: ");
                tree.traverseTree(tree.root);
                System.out.println(" ");
                System.out.println("Binary Tree Height: " + tree.getHeight());
                
            }
            else{
                System.out.println("Please enter [Y/N]");
            }
        } while (choice == 'y');
    }
}
