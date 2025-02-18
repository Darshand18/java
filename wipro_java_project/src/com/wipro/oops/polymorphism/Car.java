package com.wipro.oops.polymorphism;

public class Car {

	// Instance variables for the Car class
    private String brand;
    private int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter and Setter methods for brand and year
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to be overridden by child classes
    public void displayDetails() {
        System.out.println("Car brand: " + brand + ", Year: " + year);
    }

    // Method to simulate car's start (can be overridden by child classes)
    public void startCar() {
        System.out.println("Starting the car...");
    }
}


