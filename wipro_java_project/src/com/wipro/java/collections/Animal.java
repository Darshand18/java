package com.wipro.java.collections;
import java.util.*;
public class Animal implements Comparable<Animal>{
	private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement compareTo method from Comparable
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age); // Comparing based on age
    }

    // toString method to display Animal information
    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
    public static void main(String[] args) {
        // Create a list of Animals
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Zebra", 3));

        // Sort using Comparable (based on age)
        Collections.sort(animals); // Sorts based on compareTo method (age)
        System.out.println("Animals sorted by age (Comparable):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sort using Comparator (based on age)
        AnimalAgeComparator ageComparator = new AnimalAgeComparator();
        Collections.sort(animals, ageComparator); // Sort using custom Comparator
        System.out.println("\nAnimals sorted by age (Comparator):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sort using Comparator (based on name)
        AnimalNameComparator nameComparator = new AnimalNameComparator();
        Collections.sort(animals, nameComparator); // Sort using name comparator
        System.out.println("\nAnimals sorted by name (Comparator):");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}