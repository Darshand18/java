package com.wipro.oops.polymorphism;

public class SportsCar extends Car {

	 private int topSpeed;

	    // Constructor
	    public SportsCar(String brand, int year, int topSpeed) {
	        super(brand, year);
	        this.topSpeed = topSpeed;
	    }

	    // Getter and Setter for topSpeed
	    public int getTopSpeed() {
	        return topSpeed;
	    }

	    public void setTopSpeed(int topSpeed) {
	        this.topSpeed = topSpeed;
	    }

	    // Overriding the displayDetails method
	    @Override
	    public void displayDetails() {
	        System.out.println("Sports Car brand: " + getBrand() + ", Year: " + getYear() + ", Top speed: " + topSpeed + " km/h");
	    }

	    // Overriding the startCar method
	    @Override
	    public void startCar() {
	        System.out.println("Starting the sports car with a roar...");
	    }
	    public static void main(String[] args) {
	        // Create objects of the child classes
	        
	        Car mySportsCar = new SportsCar("Ferrari", 2022, 350);

	        // Call the displayDetails method (polymorphism in action)
	       
	        mySportsCar.displayDetails();

	        // Call the startCar method (polymorphism in action)
	       
	        mySportsCar.startCar();
	    }
	}
	



