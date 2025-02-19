package com.wipro.java.collections.usecase4;

// Define an Employee class
class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters for Employee fields
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', age=" + age + "}";
    }
}
