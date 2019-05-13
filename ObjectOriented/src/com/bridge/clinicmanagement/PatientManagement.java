package com.bridge.clinicmanagement;

import java.util.Scanner;

public class PatientManagement {
	Scanner sc;
	JsonReadWrite json;
	Patients patients;
	
	public PatientManagement() {
		sc = new Scanner(System.in);
		json = new JsonReadWrite();
		patients = new Patients();
	}
	
	public void searchPatient() {
		
		
	}

	public void addPatient() {
		System.out.print("Enter Patient Name         : ");
		patients.setName(sc.next());
		System.out.print("Enter Patient Id           : ");
		patients.setId(sc.nextInt());
		System.out.print("Enter Patients Contact No  : ");
		patients.setContactNumber(sc.next());
		json.write("patient.json", patients);
	}

	public void techAppoinment() {
		
		
	}

	public void checkSpeciality() {
		
		
	}

}
