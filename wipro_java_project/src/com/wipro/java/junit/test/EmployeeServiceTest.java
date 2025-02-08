package com.wipro.java.junit.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.wipro.java.java8.usecase.Employee;
import com.wipro.java.java8.usecase.EmployeeService;

import static org.junit.jupiter.api.Assertions.*;
public class EmployeeServiceTest {
	 private EmployeeService employeeService;
	    private Employee employee1;
	    private Employee employee2;

	    @BeforeEach
	    void setUp() {
	        // Initialize EmployeeService and sample employees before each test
	        employeeService = new EmployeeService();
	        employee1 = new Employee(1, "Ram", "IT", 50000, LocalDate.of(2020, 5, 10));
	        employee2 = new Employee(2, "Bheem", "HR", 45000, LocalDate.of(2019, 3, 15));

	        employeeService.addEmployee(employee1);
	        employeeService.addEmployee(employee2);
	    }

	    @Test
	    void testAddEmployee() {
	        Employee newEmployee = new Employee(3, "Shyam", "Finance", 60000, LocalDate.of(2021, 8, 22));
	        employeeService.addEmployee(newEmployee);
	        assertEquals(3, employeeService.getEmployees().size(), "Employee count should be 3");
	    }

	    @Test
	    void testRemoveEmployee() {
	        employeeService.removeEmployee(employee1.getId());
	        assertEquals(1, employeeService.getEmployees().size(), "Employee count should be 1 after removal");
	    }

	    @Test
	    void testSearchEmployee() {
	        Optional<Employee> employee = employeeService.searchEmployee(1);
	        assertTrue(employee.isPresent(), "Employee should be found");
	        assertEquals("Ram", employee.get().getName(), "Employee name should match");
	    }

	    @Test
	    void testUpdateSalary() {
	        double newSalary = 55000;
	        employeeService.updateSalary(1, newSalary);
	        Optional<Employee> updatedEmployee = employeeService.searchEmployee(1);
	        assertTrue(updatedEmployee.isPresent(), "Employee should be found");
	        assertEquals(newSalary, updatedEmployee.get().getSalary(), "Employee salary should be updated");
	    }

	    @Test
	    void testDisplayEmployees() {
	        // Display employees is a void method, so we just ensure it does not throw exceptions
	        assertDoesNotThrow(() -> employeeService.displayEmployees(), "Displaying employees should not throw any exceptions");
	    }

	    @Test
	    void testFilterByDepartment() {
	        List<Employee> employeesInDept = employeeService.filterByDepartment("IT");
	        assertFalse(employeesInDept.isEmpty(), "There should be at least one employee in IT department");
	        assertEquals("IT", employeesInDept.get(0).getDepartment(), "Department should match IT");
	    }

	    @Test
	    void testSortByName() {
	        List<Employee> sortedEmployees = employeeService.sortByName();
	        assertEquals("Bheem", sortedEmployees.get(0).getName(), "Employees should be sorted by name");
	    }

	    @Test
	    void testGetAverageSalary() {
	        double avgSalary = employeeService.getAverageSalary();
	        assertEquals(47500, avgSalary, 0.01, "Average salary should be 47500");
	    }
}
