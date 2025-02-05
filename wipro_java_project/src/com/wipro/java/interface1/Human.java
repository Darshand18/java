package com.wipro.java.interface1;

//Implementing both Animal and Mammal interfaces for Human (Multiple Interface Implementation)
public class Human implements Animal, Mammal{

	@Override
	public void speak() {
		  System.out.println("Hello! How are you?");
	}

	@Override
	public void sleep() {
		System.out.println("Sleeping peacefully");
	}

}
