package com.greatlearning.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String department;
	
	public Employee(String firstname, String lastName, String department) {
		// TODO Auto-generated constructor stub
		this.firstName = firstname;
		this.lastName = lastName;
		this.department = department;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstname) {
		this.firstName = firstname;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getdepartment() {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department = department;
	}
	
	
	
	
}
