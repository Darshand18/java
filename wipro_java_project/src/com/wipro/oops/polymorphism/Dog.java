package com.wipro.oops.polymorphism;

public class Dog extends Animal{
	// Overriding the sound() method
    public void sound() {
        System.out.println("Dog barks");
    }
	public static void main(String[] args) {
		
		 // Creating object of Dog
        Animal myDog = new Dog();
        
        // Polymorphism in action
        myDog.sound(); // Will call Dog's sound()
	}

}

