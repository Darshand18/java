package com.wipro.java.collections.usecase4;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListSortExample {

    public static void main(String[] args) {
        // Create a LinkedList of Employee objects
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "John", 28));
        employeeList.add(new Employee(2, "Alice", 32));
        employeeList.add(new Employee(3, "Bob", 25));
        employeeList.add(new Employee(4, "Charlie", 30));
        
        // Print the original list
        System.out.println("Original LinkedList:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Sort by name using Comparator
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        // Print the sorted list
        System.out.println("\nSorted by Name:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }

        // Sort by age using Comparator
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Integer.compare(e1.getAge(), e2.getAge());
            }
        });

        // Print the sorted list by age
        System.out.println("\nSorted by Age:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}
