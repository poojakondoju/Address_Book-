package com.addressBook;

import java.util.Scanner;

public class AddressBook {

	Contacts contacts = new Contacts();
	Scanner scanner = new Scanner(System.in);

	/*
	 * adding contact details
	 */
	public void addDetails() {
		// Adding contact details at console
		System.out.println("Enter First Name");
		String firstName = scanner.nextLine();
		System.out.println("Enter Second Name");
		String lastName = scanner.nextLine();
		System.out.println("Enter City");
		String city = scanner.nextLine();
		System.out.println("Enter State");
		String state = scanner.nextLine();
		System.out.println("Enter zip");
		String zip = scanner.nextLine();
		System.out.println("Enter Phone Number");
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter Email");
		String email = scanner.nextLine();

		contacts.setFirstName(firstName);
		contacts.setLastName(lastName);
		contacts.setCity(city);
		contacts.setState(state);
		contacts.setZip(zip);
		contacts.setPhoneNumber(phoneNumber);
		contacts.setEmail(email);

	}

	/*
	 * editing contact first name
	 */
	public void editContact() {
		System.out.println("Do you want to edit name. (y/n)");
		String change = scanner.nextLine();
		if (change.equalsIgnoreCase("y")) {
			System.out.println("Enter new name");
			String newName = scanner.next();
			contacts.setFirstName(newName);
		}
	}
}