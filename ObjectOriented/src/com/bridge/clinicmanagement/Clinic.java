package com.bridge.clinicmanagement;

public class Clinic {
	public String name;
	public Doctor[] doctor;

	
	public Clinic() {
	}

	public Clinic(String name, Doctor[] doctor) {
		this.name = name;
		this.doctor = doctor;
	}
	
	
	
	public Doctor[] getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor[] doctor) {
		this.doctor = doctor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
