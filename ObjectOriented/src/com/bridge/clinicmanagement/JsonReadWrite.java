package com.bridge.clinicmanagement;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridge.addressbook.Person;

public class JsonReadWrite {
	ObjectMapper mapper;
	/*0-param Constructor*/
	public JsonReadWrite() {
		mapper = new ObjectMapper();
	}

	/* Constructor Using Field */
	public JsonReadWrite(ObjectMapper mapper) {
		this.mapper = mapper;
	}
	/* Method to write Java Object to json */
	public void write(String fileName, Patient_Doctor patient_Doctor) {
		try {
			mapper.writeValue(new File(fileName), patient_Doctor);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* Method to write Java Object to json */
	public Patient_Doctor[] readFile(String fileName) throws JsonParseException, JsonMappingException, IOException {
		Patient_Doctor[] patient_Doctor = mapper.readValue(new File(fileName), Doctor[].class);
		return patient_Doctor; 
	}

}
