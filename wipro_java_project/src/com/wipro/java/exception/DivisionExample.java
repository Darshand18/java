package com.wipro.java.exception;

public class DivisionExample {
    public static void main(String[] args) {
        
        try {
            // Define two numbers
            double num1 = 10.0;
            double num2 = 0.0;
            
            // Perform division
            double result = num1 / num2;
            System.out.println("The result of " + num1 + " divided by " + num2 + " is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
        }
    }
}

