package com.wipro.java.collections.usecase2;

import java.util.*;

public class TreeMapToHashMap {
    public static void main(String[] args) {
        // Step 1: Create a TreeMap and populate it
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        
        // Adding some data to the TreeMap
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        
        // Step 2: Create a HashMap to store the data
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Step 3: Fetch the data from the TreeMap and store it in the HashMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }

        // Step 4: Print the content of the HashMap to confirm
        System.out.println("Contents of HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
