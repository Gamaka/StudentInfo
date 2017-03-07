package com.fastcode.student.model;

public class Student {
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	String reference;
	String lastName;
	String otherNames;
	String contact;
}
