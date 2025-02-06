package com.wipro.java.java8;

import java.time.LocalDate;

public class Adjust {
	public static void main(String[] args) {
        // Create a LocalDate instance for a specific date
        LocalDate currentDate = LocalDate.now();  // Current date
        System.out.println("Current Date: " + currentDate);

        // Adjusting the date - adding days, months, and years
        LocalDate futureDate = currentDate.plusDays(10);  // Add 10 days
        System.out.println("Date after 10 days: " + futureDate);

        LocalDate pastDate = currentDate.minusMonths(3);  // Subtract 3 months
        System.out.println("Date 3 months ago: " + pastDate);

        LocalDate nextYearDate = currentDate.plusYears(1);  // Add 1 year
        System.out.println("Date after 1 year: " + nextYearDate);   
    }
}

