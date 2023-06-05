package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialService;
import com.greatlearning.interfaces.ICredentials;



public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter First Name");
		String firstName=sc.next();
		System.out.println("Please enter Last Name");
		String lastName=sc.next();
		
		Employee emp=new Employee(firstName, lastName);
		System.out.println("Please choose the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HRM");
		System.out.println("4. Legal");
		System.out.println("Selected Department is : ");
		
		int option=sc.nextInt();
		String generatedEmail=null;
		String generatedPassword=null;
		
		ICredentials ic= new CredentialService();
		
		switch (option) {
		case 1:
		generatedEmail=ic.generateEmailAddress(firstName,lastName,"tech");
		generatedPassword=ic.generatePassword();
		break;
		case 2: 
		generatedEmail=ic.generateEmailAddress(firstName,lastName,"adm");
		generatedPassword=ic.generatePassword();
		break;
		case 3:
		generatedEmail=ic.generateEmailAddress(firstName,lastName,"hrm");
		generatedPassword=ic.generatePassword();
		break;
		case 4:
		generatedEmail=ic.generateEmailAddress(firstName,lastName,"legal");
		generatedPassword=ic.generatePassword();
		break;
		
		default : {
			System.out.println("Enter a valid option");
		}
		}
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		ic.showCredentials(emp);
		sc.close();
		}
	}

