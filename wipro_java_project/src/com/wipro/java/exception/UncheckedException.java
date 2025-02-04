package com.wipro.java.exception;

public class UncheckedException {
	public static void main(String[] args) {
        try {
            // Simulating an unchecked exception (ArithmeticException)
            int result = divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }
    }

    // Method that throws an unchecked exception
    public static int divideByZero() {
        return 10 / 0;  // This will throw ArithmeticException
    }
}

