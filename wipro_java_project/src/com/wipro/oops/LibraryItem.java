package com.wipro.oops;

//Abstraction: Abstract class representing a general LibraryItem
public abstract class LibraryItem {
	
	private String title;  // Encapsulation: private field

    // Constructor to initialize the title
    public LibraryItem(String title) {
        this.title = title;
    }

    // Getter for the title (Encapsulation)
    public String getTitle() {
        return title;
    }

    // Abstract method to be implemented by subclasses (Abstraction)
    public abstract void displayDetails();

}
//Inheritance: Book extends LibraryItem
class Book extends LibraryItem {
 private String author;

 // Constructor for Book class
 public Book(String title, String author) {
     super(title);  // Calling the superclass constructor
     this.author = author;
 }

 // Implementing the abstract method (Polymorphism)
 @Override
 public void displayDetails() {
     System.out.println("Book Title: " + getTitle() + ", Author: " + author);
 }
}

//Inheritance: Magazine extends LibraryItem
class Magazine extends LibraryItem {
 private int issueNumber;

 // Constructor for Magazine class
 public Magazine(String title, int issueNumber) {
     super(title);  // Calling the superclass constructor
     this.issueNumber = issueNumber;
 }

 // Implementing the abstract method (Polymorphism)
 @Override
 public void displayDetails() {
     System.out.println("Magazine Title: " + getTitle() + ", Issue Number: " + issueNumber);
 }
}
