package com.bridge.clinicmanagement;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class DoctorManagement {
	Scanner sc;
	Doctor doctor;
	JsonReadWrite json;
	Patient_Doctor[] patient_Doctors;
	public DoctorManagement() {
		sc = new Scanner(System.in);
		doctor = new Doctor();
		json = new JsonReadWrite();
	}
	
	public void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.print("Enter Doctor Name : ");
		if (isAvailable(sc.next())) {
			System.out.println("========= Doctor is Available =========");
		}else {
			System.out.println("========= Doctor is not Available =========");
		}
	}

	

	public void addDoctor() {
		System.out.print("Enter Doctor Name        : ");
		doctor.setName(sc.next());
		System.out.print("Enter Doctor Id          : ");
		doctor.setId(sc.nextInt());
		System.out.print("Enter Doctor Speciality  : ");
		doctor.setSpecility(sc.next());
		System.out.print("Enter Doctor Availablity : ");
		doctor.setAvailablity(sc.next());
		json.write("doctor.json",doctor);
	}
	
	
	private boolean isAvailable(String name) throws JsonParseException, JsonMappingException, IOException {
			patient_Doctors = json.readFile("doctor.json");
			for (int i = 0; i < patient_Doctors.length; i++) {
				if (((Doctor) patient_Doctors[i]).getName().equalsIgnoreCase(name)) {
					return true;
				}
			}
		return false;
	}
}
