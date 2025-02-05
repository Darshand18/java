package com.wipro.java.collections;
import java.util.*;

public class CollectionsExample {
	// List Operations
    private List<Integer> myList = new ArrayList<>();

    // Set Operations
    private Set<Integer> mySet = new HashSet<>();

    // Map Operations 
    private Map<String, Integer> myMap = new HashMap<>();

    // List Operations
    public void listOperations() {
        myList.add(1);  // Add elements to the list
        myList.add(2);
        myList.add(3);
        System.out.println("List after adding elements: " + myList);

        myList.remove(Integer.valueOf(2));  // Remove element from list
        System.out.println("List after removing element '2': " + myList);

        // Accessing elements
        System.out.println("First element of the list: " + myList.get(0));
    }

    // Set Operations
    public void setOperations() {
        mySet.add(1);  // Add elements to the set
        mySet.add(2);
        mySet.add(3);
        System.out.println("Set after adding elements: " + mySet);

        mySet.remove(2);  // Remove element from set
        System.out.println("Set after removing element '2': " + mySet);

        // Checking if an element is in the set
        System.out.println("Does the set contain 1? " + mySet.contains(1));
    }

    // Map Operations
    public void mapOperations() {
        myMap.put("John", 25);  // Add key-value pair
        myMap.put("Alice", 30);
        System.out.println("Map after adding key-value pairs: " + myMap);

        // Accessing value using key
        System.out.println("Age of John: " + myMap.get("John"));

        myMap.put("Alice", 31);  // Update value for a key
        System.out.println("Map after updating Alice's age: " + myMap);

        myMap.remove("John");  // Remove key-value pair
        System.out.println("Map after removing 'John': " + myMap);
    }

    public static void main(String[] args) {
        CollectionsExample collectionsExample = new CollectionsExample();

        // Perform operations on all collections
        System.out.println("------ List Operations ------");
        collectionsExample.listOperations();
        System.out.println("------ Set Operations ------");
        collectionsExample.setOperations();
        System.out.println("------ Map Operations ------");
        collectionsExample.mapOperations();
    }
}
