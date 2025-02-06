package com.wipro.java.java8;

@FunctionalInterface
interface Shape {
	// Abstract method (single abstract method)
    public void area(int radius);

    // Default method 1
    default String showMessage(String message) {
        return "Message: " + message;
    }

    // Default method 2
    default String shapeInfo(String shapeName) {
        return "Shape Name: " + shapeName;
    }

    // Static method 1
    static String staticMessage() {
        return "Static Method Executed for Shape";
    }

    // Static method 2
    static String shapeDetails() {
        return "Static Shape Details Executed";
    }
}
