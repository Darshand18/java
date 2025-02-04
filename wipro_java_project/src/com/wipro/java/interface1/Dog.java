package com.wipro.java.interface1;

//Implementing the Animal interface for Dog (Single Interface Implementation)
public class Dog implements Animal {

	@Override
	public void speak() {
		System.out.println("Barks!");
	}

}
