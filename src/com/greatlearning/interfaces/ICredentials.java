package com.greatlearning.interfaces;
import com.greatlearning.model.Employee;

public interface ICredentials {
	public String generateEmailAddress(String firstName,String lastName,String department);
	//since we want email address
	public String generatePassword();//since we want to generate password
	public void showCredentials(Employee emp);//since we have to show credentials, no return so void

}
