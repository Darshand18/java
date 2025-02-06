package com.wipro.java.java8;

//Interface 1 with default method show()
interface Interface1 {
 // Default method
 default void show() {
     System.out.println("Interface1 - show() method");
 }
}

//Interface 2 with default method show()
interface Interface2 {
 // Default method
 default void show() {
     System.out.println("Interface2 - show() method");
 }
}

public class DefaultUseCase implements Interface1, Interface2{
	// Override the show() method to call both interfaces' show() methods using super()
    @Override
    public void show() {
        // Calling show() method from Interface1
        Interface1.super.show();
        
        // Calling show() method from Interface2
        Interface2.super.show();
    }

    public static void main(String[] args) {
        DefaultUseCase useCase = new DefaultUseCase();
        useCase.show(); // It will call show() from both interfaces
    }
}
