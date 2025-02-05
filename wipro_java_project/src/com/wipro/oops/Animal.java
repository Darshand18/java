package com.wipro.oops;

/**
 * Animal class represents an animal with specific attributes.
 * No constructor
 * Getters have return value
 * setters have no return value
 * properties are determined using private fields
 * values are behaviors are determined through setters
 */
public class Animal {

	//Private properties=Structure
    private String color; 
    private String name;
    private String species;
    private int age;

	// Getter method for color field
    public String getColor() {
        return color;
    }

    // Setter method for color field
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for name field
    public String getName() {
        return name;
    }

    // Setter method for name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for species field
    public String getSpecies() {
        return species;
    }

    // Setter method for species field
    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter method for age field
    public int getAge() {
        return age;
    }

    // Setter method for age field
    public void setAge(int age) {
        this.age = age;
    }

    /// Overriding toString() method to return the details of the Animal object
    @Override
    public String toString() {
        return "Animal [color=" + color + ", name=" + name + 
               ", species=" + species + ", age=" + age + "]";
    }
}
