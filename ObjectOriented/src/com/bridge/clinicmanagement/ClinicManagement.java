package com.bridge.clinicmanagement;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class ClinicManagement {
	static Scanner sc;
	static DoctorManagement doctorManagement;
	static PatientManagement patientManagement;
	static {
		sc = new Scanner(System.in);
		doctorManagement = new DoctorManagement();
		patientManagement = new PatientManagement();
	}
	
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		int choice = displayScreen();
		
		switch (choice) {
			case 1:
				doctorManagement.searchDoctor();
				break;
			case 2:
				patientManagement.searchPatient();
				break;
			case 3:
				doctorManagement.addDoctor();
				break;
			case 4:
				patientManagement.addPatient();
				break;
			case 5:
				patientManagement.techAppoinment();
				break;
			case 6:
				patientManagement.checkSpeciality();
				break;
			default:
			break;
		}
		
	}

	public static int displayScreen() {
		System.out.println("============= Clinic Management =============");
		System.out.println("1 . Search Doctor");
		System.out.println("2 . Search Patient");
		System.out.println("3 . Add Doctor");
		System.out.println("4 . Add Patient");
		System.out.println("5 . Take Appointment");
		System.out.println("6 . Check Speciality");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		return sc.nextInt();
	}

}
