/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class MyClass {
	int num = 5;
	
	public void changeValue(int num) {
        this.num = num;
    }


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyClass obj = new MyClass(); //Creating a object of a MyClass
        obj.changeValue(10);  // Call changeValue method to update num
        System.out.println(obj.num); // printing the updated value of num
	}

}
