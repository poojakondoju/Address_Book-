package com.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

	public String firstName;
	public String lastName;
	public String city;
	public String state;
	public String zip;
	public String phoneNumber;
	public String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Overriding java toString method
	public String toString() {
		return "Contact details" + '\n' + "First Name: " + firstName + '\n' + "Last  Name: " + lastName + '\n'
				+ "City : " + city + '\n' + "State : " + state + '\n' + "ZIP : " + zip + '\n' + "Phone Number : "
				+ phoneNumber + '\n' + "Email Id: " + email + '\n';
	}
}