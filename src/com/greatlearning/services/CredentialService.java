package com.greatlearning.services;
import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService implements ICredentials {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".gl.com";
	}

	@Override
	public String generatePassword() {
		String password="";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="123456789";
		String specialCharacter="!@#$%^&*()<>";
		String values=capitalLetters+smallLetters+numbers+specialCharacter;// value has all characters
		Random random=new Random();
		for(int i=0;i<2;i++) {// want two captitalLettes
			int index=random.nextInt(capitalLetters.length());
					char c = capitalLetters.charAt(index);
					password+=String.valueOf(c);}
					
					for(int i=0;i<2;i++) {
						int index=random.nextInt(smallLetters.length());
						char c = smallLetters.charAt(index);
						password+=String.valueOf(c); }

						for(int i=0;i<2;i++) {
							int index=random.nextInt(numbers.length());
							char c = numbers.charAt(index);
							password+=String.valueOf(c); }

							for(int i=0;i<2;i++) {
								int index=random.nextInt(specialCharacter.length());
								char c = specialCharacter.charAt(index);
								password+=String.valueOf(c);

		}
							StringBuffer sb= new StringBuffer(password);
							String temp =sb.toString();
							String result="";
		
							for(int i=0;i<8;i++) {
								int index = random.nextInt(temp.length());
								char c = temp.charAt(index);
								result+=String.valueOf(c);
							}
							/*for(int i = 0;i<8;i++)
							{
								int index=random.nextInt(values.length());
								System.out.println("index:"+index);
								char c=values.charAt(index);
								System.out.println("picked up character:"+c);
								password+=String.valueOf(c);*/

								System.out.println("password:"+result);
							
							return result;
	}
	
	public void showCredentials(Employee emp) {
		System.out.println("");
		System.out.println("");
		System.out.println("Hi, Welcome to the Company!!!!! "+emp.getFirstName()+""+emp.getLastName()+" Following are your confidential credentials:");
		System.out.println("Email is : "+emp.getEmail());
		System.out.println("Password is: "+emp.getPassword());
	
}
	
	}
