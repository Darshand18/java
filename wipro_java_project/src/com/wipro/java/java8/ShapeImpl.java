package com.wipro.java.java8;

public class ShapeImpl implements Shape{

	@Override
	public void area(int radius) {
		double area = Math.PI * radius * radius;
        System.out.println("Area of Circle with radius " + radius + ": " + area);
	}
	public static void main(String[] args) {
        // Creating an instance of ShapeImpl to use the methods
        ShapeImpl shapeObj = new ShapeImpl();

        // Calling the abstract method
        shapeObj.area(5);

        // Calling the default methods
        System.out.println(shapeObj.showMessage("This is a functional interface example"));
        System.out.println(shapeObj.shapeInfo("Circle"));

        // Calling the static methods directly from the interface
        System.out.println(Shape.staticMessage());
        System.out.println(Shape.shapeDetails());
    }
}
