package com.wipro.java.java8;

public class StringApi {
	public static void main(String[] args) {
        // String creation
        String str1 = "Hello, ";
        String str2 = "World!";
        
        // String concatenation
        String concatenated = str1.concat(str2);
        System.out.println("Concatenated String: " + concatenated);
        
        // Substring extraction
        String substring = concatenated.substring(7, 12);
        System.out.println("Substring (from index 7 to 12): " + substring);
        
        // String comparison
        String str3 = "HELLO, WORLD!";
        boolean areEqual = concatenated.equalsIgnoreCase(str3);
        System.out.println("Are the strings equal (ignoring case)? " + areEqual);
        
        // String length
        int length = concatenated.length();
        System.out.println("Length of the concatenated string: " + length);
        
        // String to Upper Case
        String upperCaseStr = concatenated.toUpperCase();
        System.out.println("String in Upper Case: " + upperCaseStr);
        
        // String to Lower Case
        String lowerCaseStr = concatenated.toLowerCase();
        System.out.println("String in Lower Case: " + lowerCaseStr);
        
        // String Replace
        String replacedStr = concatenated.replace("World", "Java");
        System.out.println("String after replacement: " + replacedStr);
    }
}
