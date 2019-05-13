
package com.bridge.addressbook;

public class Person {
	public String fName;
	public String lName;
	public String address;
	public String city;
	public int pinCode;
	public String moNumber;
	
	
	
	//O-param Constructor
	public Person() {
		
	}

	//Constructor using Field
	public Person(String fName, String lName, String address, String city, int pinCode, String moNumber) {
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.moNumber = moNumber;
	}
	
	//Getters and Setters
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getMoNumber() {
		return moNumber;
	}
	public void setMoNumber(String moNumber) {
		this.moNumber = moNumber;
	}

	@Override
	public String toString() {
		return  fName + " " + lName + " : { address = " + address + ", city = " + city + ", pinCode = "
				+ pinCode + ", moNumber = " + moNumber + "}";
	}
	
	
	
}
