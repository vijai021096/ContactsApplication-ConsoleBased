package com.vj.contacts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 
 * @author vijai
 *
 */
public class Phone {

	private List<Contacts> contactList;

	public Phone() {
		contactList = new ArrayList<>();
	}

	public List<Contacts> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contacts> contactList) {
		this.contactList = contactList;
	}

	/**
	 * 
	 * Create a new Contact
	 * 
	 * @param contact
	 * @return
	 */

	public boolean addContact(Contacts contact) {
		if (findContact(contact)) {
			contactList.add(contact);
			System.out.println("Contact created");
			setContactList(contactList);
			return true;

		}
		return false;

	}

	/**
	 * check whether the contact is already added or not
	 * 
	 * @param contact
	 * @return 
	 * @return 
	 * @return
	 */

	public Boolean findContact(Contacts contact) {

		
		for(int i=0;i<contactList.size();i++){
			if (contactList.get(0).getContactName().equals(contact.getContactName())) {
				System.out.println("Contact with same Name already exists");
				
				return false;
			} else if (contactList.get(0).getPhoneNum() == contact.getPhoneNum()) {
				System.out.println("Contact with same Number already exists");
				
				return false;
			} else if (contactList.get(0).getEmailId().equals(contact.getEmailId())) {
				System.out.println("Contact with same emailId already exists");
				
				return false;
			}

		}
		
		return true;
	}

	/**
	 * Print contacts
	 * 
	 * @param contactList
	 */
	public void printContact() {
		if (this.contactList.size() > 0) {
			contactList.stream().forEach(con -> {
				System.out.println("--------------------------------------");
				System.out.println("Name:" + " " + con.getContactName());
				System.out.println("Number:" + " " + con.getPhoneNum());
				System.out.println("EmailId:" + " " + con.getEmailId());
				System.out.println("--------------------------------------");
			});
		} else {
			System.out.println("Contact lsit is empty");
		}
	}
}
