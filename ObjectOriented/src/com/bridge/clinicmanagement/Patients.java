package com.bridge.clinicmanagement;

public class Patients implements Patient_Doctor{
	public int id;
	public String name;
	public String contactNumber;
	
	
	
	public Patients() {
	}
	
	public Patients(int id, String name, String contactNumber) {
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
}
