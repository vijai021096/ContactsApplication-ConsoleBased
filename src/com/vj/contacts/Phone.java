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
	 * Delete contact by name
	 * 
	 * @param name
	 */
	public void deleteContact(String name) {
		int flag=0;
		for(int i=0;i<contactList.size();i++) {
			if(contactList.get(i).getContactName().equals(name)) {
				contactList.remove(i);
				flag=1;
				System.out.println("Contact deleted");
				break;
			}
		}
		if(flag==0) {
			System.out.println("No Contacts found with the given Name");
		}	
	}
	/**
	 * Update Contact Num.
	 * @param name
	 * @param num
	 */
	public void updateContactNum(String name,long num) {
		int flag=0;
		for(int i=0;i<contactList.size();i++) {
			if(contactList.get(i).getContactName().equals(name)) {
				contactList.get(i).setPhoneNum(num);
				flag=1;
				System.out.println("Contact Updated");
			}
	
	}
		if(flag==0) {
			System.out.println("No Contacts FOund with given name");
		}
	}
	
	public void updateContactName(String oldName,String newName) {
		int flag=0;
		for(int i=0;i<contactList.size();i++) {
			if(contactList.get(i).getContactName().equals(oldName)) {
				contactList.get(i).setContactName(newName);
				flag=1;
				System.out.println("Contact Updated");
			}
	
	}
		if(flag==0) {
			System.out.println("No Contacts FOund with given name");
		}
	
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
