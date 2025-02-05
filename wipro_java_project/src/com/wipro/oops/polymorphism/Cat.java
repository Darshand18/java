/**
 * 
 */
package com.wipro.oops.polymorphism;

/**
 * 
 */
public class Cat extends Animal{

	/**
	 * @param args
	 */
	// Overriding the sound() method
    public void sound() {
        System.out.println("Cat meows");
    }
	public static void main(String[] args) {
		
		 // Creating object of Cat
        Animal myCat = new Cat();
        
        // Polymorphism in action
        myCat.sound(); // Will call Cat's sound()
	}

}
