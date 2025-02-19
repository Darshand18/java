package com.wipro.java.collections.usecase2;

import java.util.*;

public class FibonacciTreeMap {
    
    public static void main(String[] args) {
        // Define the number of Fibonacci numbers to generate
        int n = 10; // Example: first 10 Fibonacci numbers
        
        // Create a TreeMap to store Fibonacci numbers with their indices as keys
        TreeMap<Integer, Long> fibonacciMap = new TreeMap<>();
        
        // Generate Fibonacci series and store in the TreeMap
        for (int i = 0; i < n; i++) {
            fibonacciMap.put(i, fibonacci(i));
        }
        
        // Print the Fibonacci series stored in the TreeMap
        System.out.println("Fibonacci Series (stored in TreeMap):");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Index: " + entry.getKey() + ", Fibonacci Number: " + entry.getValue());
        }
    }
    
    // Method to calculate the nth Fibonacci number
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            long a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                long temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
}
