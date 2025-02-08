package com.wipro.java.junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.java.java8.usecase.Employee;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

	    private Employee employee;

	    @BeforeEach
	    void setUp() {
	        // Initialize Employee object before each test
	        employee = new Employee(1, "Ram", "IT", 50000, LocalDate.of(2020, 5, 10));
	    }

	    @Test
	    void testGetId() {
	        assertEquals(1, employee.getId(), "ID should be 1");
	    }

	    @Test
	    void testGetName() {
	        assertEquals("Ram", employee.getName(), "Name should be Ram");
	    }

	    @Test
	    void testGetDepartment() {
	        assertEquals("IT", employee.getDepartment(), "Department should be IT");
	    }

	    @Test
	    void testGetSalary() {
	        assertEquals(50000, employee.getSalary(), 0.01, "Salary should be 50000");
	    }

	    @Test
	    void testGetJoiningDate() {
	        assertEquals(LocalDate.of(2020, 5, 10), employee.getJoiningDate(), "Joining date should be 2020-05-10");
	    }

	    @Test
	    void testSetName() {
	        employee.setName("Shyam");
	        assertEquals("Shyam", employee.getName(), "Name should be updated to Shyam");
	    }

	    @Test
	    void testSetDepartment() {
	        employee.setDepartment("HR");
	        assertEquals("HR", employee.getDepartment(), "Department should be updated to HR");
	    }

	    @Test
	    void testSetSalary() {
	        employee.setSalary(55000);
	        assertEquals(55000, employee.getSalary(), 0.01, "Salary should be updated to 55000");
	    }

	    @Test
	    void testToString() {
	        String expected = "Employee { ID=1, Name='Ram', Dept='IT', Salary=50000.0, JoiningDate=2020-05-10 }";
	        assertEquals(expected, employee.toString(), "toString should return the correct string representation");
	    }
}


