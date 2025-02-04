package com.wipro.java.interface1;

public interface Animal {
	// Abstract method for speaking
    void speak();  // This method does not throw any exception

public static void main(String[] args) {
    // Single Interface Implementation
    Animal dog = new Dog();
    Animal cat = new Cat();
    
    // Multiple Interface Implementation
    Human human = new Human();
    
    // Using the speak method from Animal interface
    dog.speak();  
    cat.speak();  
    human.speak();  

    // Using the sleep method from Mammal interface
    human.sleep(); 
}
}