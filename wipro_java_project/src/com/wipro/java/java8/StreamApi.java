package com.wipro.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
        // First list to sort
        List<Integer> numbers1 = Arrays.asList(5, 2, 8, 1, 3);
        
        // Sorting the numbers in ascending order
        List<Integer> sortedNumbers = numbers1.stream()
                                              .sorted() // Sort the numbers in ascending order
                                              .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);
        
        // Second list to find min and max
        List<Integer> numbers2 = Arrays.asList(10, 20, 5, 25, 30);
        
        // Find minimum value from the list
        int min = numbers2.stream()
                          .min(Integer::compare) // Find the min using compare method
                          .get(); // Get the result from Optional
        System.out.println("Minimum value: " + min);
        
        // Find maximum value from the list
        int max = numbers2.stream()
                          .max(Integer::compare) // Find the max using compare method
                          .get(); // Get the result from Optional
        System.out.println("Maximum value: " + max);
    }
}

