package com.bridge.addressbook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class Edit {

	public void editCity(String name, String city) throws IOException {
		JsonReadWrite json = new JsonReadWrite();
		Person[] person = json.readFile();
		for (int i = 0; i < person.length; i++) {
			if(person[i].getfName().equalsIgnoreCase(name)) {
				person[i].setCity(city);
			}
		}
		json.writeFile(person);
	}

	public void editAddress(String name, String address) throws JsonGenerationException, JsonMappingException, IOException {
		JsonReadWrite json = new JsonReadWrite();
		Person[] person = json.readFile();
		for (int i = 0; i < person.length; i++) {
			if(person[i].getfName().equalsIgnoreCase(name)) {
				person[i].setAddress(address);
			}
		}
		json.writeFile(person);
	}

	public void editPinCode(String name, int pinCode) throws JsonGenerationException, JsonMappingException, IOException {
		JsonReadWrite json = new JsonReadWrite();
		Person[] person = json.readFile();
		for (int i = 0; i < person.length; i++) {
			if(person[i].getfName().equalsIgnoreCase(name)) {
				person[i].setPinCode(pinCode);
			}
		}
		json.writeFile(person);
	}

	public void editMobile(String name, String mobile) throws JsonGenerationException, JsonMappingException, IOException {
		JsonReadWrite json = new JsonReadWrite();
		Person[] person = json.readFile();
		for (int i = 0; i < person.length; i++) {
			if(person[i].getfName().equalsIgnoreCase(name)) {
				person[i].setMoNumber(mobile);
			}
		}
		json.writeFile(person);
		
	}
	
}
