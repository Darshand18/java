package com.wipro.oops.polymorphism;

public class ElectricCar extends Car{

	private int batteryLife;

    // Constructor
    public ElectricCar(String brand, int year, int batteryLife) {
        super(brand, year);
        this.batteryLife = batteryLife;
    }

    // Getter and Setter for batteryLife
    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Electric Car brand: " + getBrand() + ", Year: " + getYear() + ", Battery life: " + batteryLife + " hours");
    }

    // Overriding the startCar method
    @Override
    public void startCar() {
        System.out.println("Starting the electric car silently...");
    }
    public static void main(String[] args) {
        // Create objects of the child classes
        Car myElectricCar = new ElectricCar("Tesla", 2023, 500);
       

        // Call the displayDetails method (polymorphism in action)
        myElectricCar.displayDetails();
        

        // Call the startCar method (polymorphism in action)
        myElectricCar.startCar();
        
    }
}


