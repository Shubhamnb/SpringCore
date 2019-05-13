package com.bridge.JSON;

import java.io.File;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectMapperInventeryManagement {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Meals[] meals;
		try {
			JsonNode rootNode = mapper.readTree(new File("JsonFile.json"));
            JsonNode inventry = rootNode.get("rice");
            meals = mapper.readValue(inventry, Meals[].class);
            
			System.out.println("================Rice====================");
            System.out.println();
            for (Meals meals2 : meals) {
				System.out.println(meals2);
			}
			System.out.println();
			System.out.println("================Pulses====================");
			System.out.println();
			rootNode = mapper.readTree(new File("JsonFile.json"));
			inventry = rootNode.get("pulses");
			meals = mapper.readValue(inventry, Meals[].class);
			for (Meals meals2 : meals) {
				System.out.println(meals2);
			}
			
			System.out.println();
			System.out.println("================Wheat====================");
			System.out.println();
			rootNode = mapper.readTree(new File("JsonFile.json"));
			inventry = rootNode.get("wheats");
			meals = mapper.readValue(inventry, Meals[].class);
			for (Meals meals2 : meals) {
				System.out.println(meals2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
