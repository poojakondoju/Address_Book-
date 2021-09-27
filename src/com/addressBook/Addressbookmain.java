package com.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressbookmain {
	/*
	 * adding contact details
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many contact you want to add...");
		int con = scanner.nextInt();
		Contacts contacts = new Contacts();
		AddressBook addressBook = new AddressBook();
		for (int i = 0; i < con; i++) {
			// creating array list
			ArrayList<Contacts> l1 = new ArrayList<Contacts>();
			// adding elements in arraylist
			l1.add(addressBook.contacts);
			addressBook.addDetails();
			System.out.println(l1);
			addressBook.editContact();
			System.out.println(l1);
		}
	}
}