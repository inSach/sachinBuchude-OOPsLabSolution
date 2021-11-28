package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first name for employee.");
		String firstName = scan.next();
		
		System.out.println("Enter last name for employee.");
		String lastName = scan.next();
		
		System.out.println("Select department.\n 1. Technical\n 2. Admin \n 3. Human Resource \n 4. Legal");
		String deptName = "";
		Integer dept = scan.nextInt();
		
		switch (dept) {
		case 1:
			deptName = "Technical";
			break;
		case 2:
			deptName = "Admin";
			break;
		case 3:
			deptName = "Human Resource";
			break;
		case 4:
			deptName = "Legal";
			break;
		default:
			System.out.println("Wrong Choice...");
		}
		
		Employee emp = new Employee(firstName, lastName, deptName);
		
		CredentialService service = new CredentialService();
		service.displayCredentials(emp, service.generateEmailAddress(emp), service.generatePWD());
		
	}
	
}
