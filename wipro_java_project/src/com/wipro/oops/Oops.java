package com.wipro.oops;

public class Oops {
	public static void main(String[] args) {
		
        // Polymorphism: Both Book and Magazine objects are treated as LibraryItem
        LibraryItem book = new Book("Java Programming", "John Doe");
        LibraryItem magazine = new Magazine("Tech Monthly", 42);

        // Calling the displayDetails() method (Demonstrating Polymorphism)
        book.displayDetails();
        magazine.displayDetails();
    }
}
