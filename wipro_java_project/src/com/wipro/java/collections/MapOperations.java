package com.wipro.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapOperations {
	public static void main(String[] args) {
        // Create a Map with Integer as the key and String as the value
        Map<Integer, String> map = new HashMap<>();

        // Putting values in the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        
        // Displaying the map
        System.out.println("Map after put operations: " + map);

        // Getting a value by key (example: get the value for key 2)
        String value = map.get(2); // Should return "Banana"
        System.out.println("Value for key 2: " + value);

        // Removing an entry by key (example: remove the entry with key 3)
        map.remove(3); // Remove the entry with key 3 (Cherry)
        System.out.println("Map after removing key 3: " + map);

        // Iterating through the map and printing each key-value pair
        System.out.println("Iterating through the map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

