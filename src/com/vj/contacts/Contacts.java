package com.vj.contacts;

/**
 * 
 * @author vijai
 *
 */
public class Contacts {

	private String contactName;

	private long phoneNum;

	private String emailId;

	public Contacts() {

	}

	public Contacts(String contactName, long phoneNum, String emailId) {
		super();
		this.contactName = contactName;
		this.phoneNum = phoneNum;
		this.emailId = emailId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

}
