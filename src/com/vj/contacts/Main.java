package com.vj.contacts;

import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author vijai
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Phone phone = new Phone();
		Contacts contacts;
		int n = 1;
		do {
			System.out.println("---------------Contacts-----------------------------------");
			System.out.println("press 1 to view contacts");
			System.out.println("press 2 to add contacts");
			System.out.println("press 3 to exit ");
			System.out.println("--------------------------------------");
			int choice = s.nextInt();
			
			

			switch (choice) {
			case 1:
				phone.printContact();
				break;
			case 2:
				System.out.println("--------------------------------------");
				System.out.println("Enter the name");
				String name = s.next();
				System.out.println("Enter the Number");
				long num = s.nextLong();
				System.out.println("Enter the emailId");
				String email = s.next();
				System.out.println("--------------------------------------");
				contacts = new Contacts(name, num, email);
				phone.addContact(contacts);
				break;
			case 3:
				System.out.println("Exiting Contacts App");
				n = 0;
				break;
			}

		} while (n > 0);
	}
}
