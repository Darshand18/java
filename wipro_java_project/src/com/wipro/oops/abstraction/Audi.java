package com.wipro.oops.abstraction;

public class Audi extends Car{

	@Override
	void engineOn() {
		System.out.println("Engine is turned On");
	}

	@Override
	void engineOff() {
		System.out.println("Engine is turned Off");
	}
	public static void main(String a[]) {
		Car audi = new Audi();
		audi.engineOn();
		audi.engineOff();
	}
}
