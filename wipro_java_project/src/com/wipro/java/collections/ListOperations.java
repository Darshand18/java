package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
	 public static void main(String[] args) {
	        
	        // Create two lists: l1 and l2
	        List<Integer> l1 = new ArrayList<>();
	        List<Integer> l2 = new ArrayList<>();
	        
	        // Adding some elements to l1 and l2
	        l1.add(10);
	        l1.add(20);
	        l1.add(30);
	        
	        l2.add(40);
	        l2.add(50);
	        
	        System.out.println("Initial List l1: " + l1);
	        System.out.println("Initial List l2: " + l2);

	        // Perform l1.addAll(1, l2); -- Add all elements of l2 starting at index 1 in l1
	        l1.addAll(1, l2);
	        System.out.println("\nAfter l1.addAll(1, l2): " + l1);
	        
	        // Perform l1.remove(1); -- Remove the element at index 1
	        l1.remove(1);
	        System.out.println("\nAfter l1.remove(1): " + l1);
	        
	        // Perform l1.set(0, 5); -- Set the element at index 0 to 5
	        l1.set(0, 5);
	        System.out.println("\nAfter l1.set(0, 5): " + l1);
	    }
	}

