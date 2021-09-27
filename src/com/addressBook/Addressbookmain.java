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
		for (int i = 0; i < con; i++) {
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
			// calling constructor through object creation.
			Contacts c1 = new Contacts(firstName, lastName, city, state, zip, phoneNumber, email);
			ArrayList<Contacts> list = new ArrayList<Contacts>();
			list.add(c1);
			System.out.println(c1);
		}
	}
}