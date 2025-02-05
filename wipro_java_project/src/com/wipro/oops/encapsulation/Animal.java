package com.wipro.oops.encapsulation;

public class Animal {
	private String species;
    private int age;

    // Constructor
    public Animal(String species, int age) {
        super(); // Calls the root parent class, which is Object
        this.species = species;
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Getter for species
    public String getSpecies() {
        return species;
    }

    // Setter for species
    public void setSpecies(String species) {
        this.species = species;
    }

    public static void main(String[] args) {
        // Creating an object of Animal class
        Animal a1 = new Animal("Dog", 5);

        // Printing the species and age of the animal
        System.out.println("Species: " + a1.getSpecies());
        System.out.println("Age: " + a1.getAge());

        // Modifying the age
        a1.setAge(7);
        System.out.println("Updated Age: " + a1.getAge());

        // Trying to set a negative age
        a1.setAge(-3); // This will print "Age must be positive"
    }
}

