package com.wipro.java.exception;

import java.io.IOException;

public class CheckedException {
	public static void main(String[] args) {
        try {
            // Simulating a checked exception (IOException)
            throwIOException();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }
    }

    // Method that throws a checked exception
    public static void throwIOException() throws IOException {
        throw new IOException("This is a checked exception.");
    }
}
