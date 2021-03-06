package com.bridge.addressbook;

import java.io.IOException;
import java.util.Scanner;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class AddressBook {
	Scanner sc;
	JsonReadWrite json;
	public AddressBook() {
		sc = new Scanner(System.in);
		json = new JsonReadWrite();
	} 
	
	//Method for Add a Person to JSON
	public void addPersons() throws JsonGenerationException, JsonMappingException, IOException {
		//JsonReadWrite json = new JsonReadWrite();
		Person[] person2 = json.readFile();
		Person[] person = getPerson();
		Person[] person3 =bindTwoArray(person2, person);
		
		json.writeFile(person3);
		
		
		Person[] personJson = json.readFile();
		//displayJsonFile(personJson);
		
	}
	
	//Method for Edit a details
	public void editPersons() throws JsonGenerationException, JsonMappingException, IOException {
		String name;
		int choice;
		System.out.println("Enter Your Name : ");
		name = sc.next();
		
		if(!isAvailable(name)) 
			System.err.println("===== Person is not available =====");
		else {
			Edit edit = new Edit();
			displayEdit(name);
			choice = sc.nextInt();
		
		
			switch (choice) {
				case 1:
					System.out.print("Enter city name : ");
					edit.editCity(name, sc.next());
					System.out.println("===== "+name+" City Updated Successfully =====");
					break;
				case 2:
					System.out.print("Enter Address : ");
					edit.editAddress(name, sc.next());
					System.out.println("===== "+name+" Address Updated Successfully =====");
					break;
				case 3:
					System.out.print("Enter Pincode : ");
					edit.editPinCode(name, sc.nextInt());
					System.out.println("===== "+name+" Pincode Updated Successfully =====");
					break;
				case 4:
					System.out.print("Enter Mobile Number : ");
					edit.editMobile(name, sc.next());
					System.out.println("========== "+name+" Mobile Number Updated Successfully ==========");
					break;
				default:
					break;
				}
		}
	}
	
	//Method to check Person is available or not
	private boolean isAvailable(String name) throws JsonGenerationException, JsonMappingException, IOException {
		//JsonReadWrite json = new JsonReadWrite();
		Person[] person = json.readFile();
			for (int i = 0; i < person.length; i++) {
				if(person[i].getfName().equalsIgnoreCase(name))
					return true;
			}
		return false;
	}
	//Method to display Edit information
	private void displayEdit(String name) {
		System.out.println("========== Hi "+name+" what you wont to edit ============");
		System.out.println("1 . City");
		System.out.println("2 . Address");
		System.out.println("3 . Pincode");
		System.out.println("4 . Mobile Number");
	}

	//To Bind A two Array into single Array
	private Person[] bindTwoArray(Person[] person2, Person[] person) {
		Person[] person3 = new Person[(person.length + person2.length)];
		int i = 0;
		
		for (int j = 0; j < person.length; j++) {
			person3[i] = person[j];
			i++;
		}
		for (int j = 0; j < person2.length; j++) {
			person3[i] = person2[j];
			i++;
		}
		return person3;
	}

	/* Method to display JsonFile */
	private void displayJsonFile(Person[] person) {
		System.out.println("================ ADDRESS BOOK ================");
		System.out.println();
		for (Person person2 : person) {
			System.out.println(person2);
		}
		System.out.println();
		System.out.println();
	}

	/* Method to get a Person data */
	private  Person[] getPerson() {
		System.out.print("Enter no of person : ");
		int num = sc.nextInt();
		Person[] person = new Person[num];
		for (int i = 0; i < num; i++) {
			person[i] = new Person();
			System.out.println("====== Enter " + (i + 1) + " Person Details ======");

			System.out.print("Enter Person First Name     : ");
			person[i].setfName(sc.next());
			System.out.print("Enter Person Last Name      : ");
			person[i].setlName(sc.next());
			System.out.print("Enter Person City           : ");
			person[i].setCity(sc.next());
			System.out.print("Enter Person Address        : ");
			person[i].setAddress(sc.next());
			System.out.print("Enter Person PinCode        : ");
			person[i].setPinCode(sc.nextInt());
			System.out.print("Enter Person Contact Number : ");
			person[i].setMoNumber(sc.next());

			System.out.println();
		}
		return person;
	}

	public void displayAddressBook() throws JsonGenerationException, JsonMappingException, IOException {
		Person[] person = json.readFile();
		displayJsonFile(person);
	}
	
	

}
