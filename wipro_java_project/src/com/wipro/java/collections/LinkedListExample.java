package com.wipro.java.collections;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        
        int n = 5;  // Set the value of n
        
        // Add elements 1 to n to the linked list
        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        // Printing elements in the linked list
        System.out.println("LinkedList: " + ll);

        // Remove element at index 3 (Note: Indexing starts from 0)
        ll.remove(3);  // Remove the element at index 3

        // Displaying the list after deletion
        System.out.println("LinkedList after removal: " + ll);

        // Printing elements one by one
        System.out.print("Elements printed one by one: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
