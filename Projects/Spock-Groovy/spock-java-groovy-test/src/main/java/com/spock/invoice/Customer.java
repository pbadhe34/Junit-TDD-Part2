package com.spock.invoice;

public class Customer {

	private String email = "";
	
	public void hasEmail(String emailAddress) 	{
		email = emailAddress;
	}

	public String getEmail() {
		return email;
	}
	
	
}
