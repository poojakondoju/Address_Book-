package com.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {
	private String firstName;
	private String lastName;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

	// creating constructor.
	public Contacts(String firstName, String lastName, String city, String state, String zip, String phoneNumber,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	// displaying values
	public String toString() {
		return "Contact details" + '\n' + "First Name: " + firstName + '\n' + "Last  Name: " + lastName + '\n'
				+ "City : " + city + '\n' + "State : " + state + '\n' + "ZIP : " + zip + '\n' + "Phone Number : "
				+ phoneNumber + '\n' + "Email Id: " + email;
	}
}