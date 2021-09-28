package com.addressBook;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Addressbookmain {
	/*
	 * adding contact details
	 */
	public static Map<String, AddressBook> addressBookHashMap = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	public void addDataToAddressBook() {

		String chooseContact, chooseAddressBook;
		do {
			System.out.println("Enter the name of Address Book");
			String cityForMap = scanner.nextLine();
			AddressBook addressBook = new AddressBook(cityForMap);
			for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
				if (entry.getKey().equals(cityForMap)) {
					addressBook = entry.getValue();
				}
			}
			addressBookHashMap.put(cityForMap, addressBook);
			do {
				System.out.println("Enter first name:");
				String firstName = scanner.nextLine();

				System.out.println("Enter last name:");
				String lastName = scanner.nextLine();

				System.out.println("Enter address name:");
				String city = scanner.nextLine();

				System.out.println("Enter state name:");
				String state = scanner.nextLine();

				System.out.println("Enter zip code:");
				String zipcode = scanner.nextLine();

				System.out.println("Enter phone number:");
				String phoneNumber = scanner.nextLine();

				System.out.println("Enter emailId number:");
				String emailID = scanner.nextLine();

				Contacts contact = new Contacts(firstName, lastName, city, state, zipcode, phoneNumber, emailID);
				System.out.println("Contact added successfully!!");

				for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
					if (entry.getKey().equalsIgnoreCase(cityForMap)) {
						entry.getValue().addContact(contact);
					}
				}
				System.out.println("Do you want to add contact again? y/n");
				chooseContact = scanner.nextLine();
			} while (chooseContact.equalsIgnoreCase("y"));
			System.out.println("Do you want to add another Address Book y/n");
			chooseAddressBook = scanner.nextLine();
		} while (chooseAddressBook.equalsIgnoreCase("y"));

		System.out.println("ADDRESS BOOK : " + addressBookHashMap);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		// Add Contact Details
		new Addressbookmain().addDataToAddressBook();
		System.out.println("Edit contact Details");
		System.out.println("Do you want to edit Details. (y/n)");
		char check = scanner.next().charAt(0);
		String addressBook;
		if (check == 'y') {
			System.out.println("Enter the address book name");
			addressBook = scanner.next();
			System.out.println("Enter First Name of the contact you want to edit");
			String checkName1 = scanner.next();

			for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
				if (entry.getKey().equalsIgnoreCase(addressBook)) {
					entry.getValue().editContactByFirstName(checkName1);
				} else {
					System.out.println("The" + addressBook + " address book does not present.");
				}
			}
		}
		System.out.println("Do you want to Delete contact. (y/n)");
		check = scanner.next().charAt(0);
		if (check == 'y') {
			System.out.println("Enter the address book name ");
			addressBook = scanner.next();
			System.out.println("Enter First Name of the contact you want to delete");
			String checkName2 = scanner.next();
			for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
				if (entry.getKey().equalsIgnoreCase(addressBook)) {
					entry.getValue().deleteContact(checkName2);
				} else {
					System.out.println("The" + addressBook + " address book does not exist.");
				}
			}
		}

		System.out.println("Display contacts");
		System.out.println(Collections.singletonList(addressBookHashMap)); // method 1
		System.out.println(Collections.singletonList(addressBookHashMap)); // method 2
		for (Map.Entry<String, AddressBook> entry : addressBookHashMap.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue().getAddressBook());
		}

	}
}