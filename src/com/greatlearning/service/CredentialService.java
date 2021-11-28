package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {
	private static String companyName = "abc";
	private String email = "";
	private String PWD = "";
	
	public String generateEmailAddress(Employee emp) {
		email = emp.getfirstName() + emp.getlastName() + "@" + emp.getdepartment() + "." + companyName + ".com";
		return email;
	}
	
	public String generatePWD() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String allowedChars = capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[8];
		for (int i=0; i< 8; i++) {
			password[i] = allowedChars.charAt(random.nextInt(allowedChars.length()));
		}
		PWD = new String(password);
		return PWD;
	}
	
	public void displayCredentials(Employee emp, String email, String PWD ) {
		System.out.println("Dear "+emp.getfirstName()+" your generated credentials are as follows");
		System.out.println("Email   -----> "+email);
		System.out.println("Password ----> "+PWD);
	}
}
