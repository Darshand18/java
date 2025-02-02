/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {

	// Attributes (properties) of the Flower class
    String name;
    String colour;
    int numberOfPetals;
	 
	public Flower(String name, String colour, int numberOfPetals) {
		 this.name = name;
	     this.colour = colour;
	     this.numberOfPetals = numberOfPetals;
	}

	// Method to display the details of the flower
    public void display() {
        System.out.println("Flower Name= " + name);
        System.out.println("Flower Colour= " + colour);
        System.out.println("Number of Petals= " + numberOfPetals);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flower rose = new Flower("Rose", "Red", 5);
        rose.display();
        
        Flower jasmine = new Flower("jasmine", "White", 8);
        jasmine.display();
	}

}
