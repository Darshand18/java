/**
 * 
 */
package com.wipro.oops;

/**
 * /**NO constructor
* Getters have return value
* setters have no return value
* properties are determined using private fields
* values are behaviors are determined through setters
* toString will convert the entire animal class with properties and behaviors
 * 
 */
public class Employee {
    
    private int id;
    private String name;
    private String department;
    private double salary;
    
    // Default constructor
    public Employee() {
    }
    
    // Constructor with parameters
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // ToString method
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }
    
 // Main method to test the class
    public static void main(String[] args) {
        // Create an Employee object using the parameterized constructor
        Employee emp1 = new Employee(1, "Ram", "Engineering", 30000.00);
        
        // Print Employee details
        System.out.println(emp1);
}
}