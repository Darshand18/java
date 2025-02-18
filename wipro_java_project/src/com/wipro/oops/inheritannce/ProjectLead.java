/**
 * 
 */
package com.wipro.oops.inheritannce;

/**
 * parent class = Employee
 * child class = ProjectLead
 * extends = keyword
 */
public class ProjectLead extends Employee{

	/**
	 * 
	 */
	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		//child object is instantiated from child constructor
	    //parent class consumes the properties and behaviors of child class
		Employee emp = new ProjectLead();
		emp.setId(24);
		emp.setName("Darshan");
		emp.setDepartment("Angular");
		emp.setSalary(30000f);
		
		System.out.println(emp.getId());;
		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getSalary());
	}
}
