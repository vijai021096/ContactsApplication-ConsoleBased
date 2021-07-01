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
			System.out.println("Press 3 to delete contacts");
			System.out.println("Press 4 to update contact Number");
			System.out.println("Press 5 to update contact Name");
			System.out.println("press 6 to exit ");
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
				System.out.println("--------------------------------------");
				System.out.println("Enter the name to delete");
				String nameToDelete = s.next();
				phone.deleteContact(nameToDelete);
				System.out.println("--------------------------------------");
				break;
			case 4:
				System.out.println("--------------------------------------");
				System.out.println("Enter the name of the contact to Update");
				String nameToUpdate = s.next();
				System.out.println("Enter the number to update");
				long number = s.nextLong();
				phone.updateContactNum(nameToUpdate, number);
				System.out.println("--------------------------------------");
				break;
		   case 5:
			    System.out.println("--------------------------------------");
				System.out.println("Enter the name of the contact to Update");
				String nameToUpdates = s.next();
				System.out.println("Enter the new name to update");
				String newName = s.next();
				phone.updateContactName(nameToUpdates, newName);
				break;
			case 6:
				System.out.println("Exiting Contacts App");
				n = 0;
				break;
			default:
				n=0;
				break;
			}
			

		} while (n > 0);
	}
}
