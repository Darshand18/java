package com.wipro.java.interface1;

//Implementing the Animal interface for Cat (Single Interface Implementation)
public class Cat implements Animal {

	@Override
	public void speak() {
		System.out.println("Meow!");
	}

}
