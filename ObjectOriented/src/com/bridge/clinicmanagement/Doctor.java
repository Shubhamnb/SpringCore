package com.bridge.clinicmanagement;

public class Doctor implements Patient_Doctor{
	public int id;
	public String name;
	public String specility;
	public String availablity;
	
	
	
	public Doctor() {
	}

	public Doctor(int id, String name, String specility, String availablity) {
		this.id = id;
		this.name = name;
		this.specility = specility;
		this.availablity = availablity;
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


	public String getSpecility() {
		return specility;
	}


	public void setSpecility(String specility) {
		this.specility = specility;
	}


	public String getAvailablity() {
		return availablity;
	}


	public void setAvailablity(String availablity) {
		this.availablity = availablity;
	}


	
}
