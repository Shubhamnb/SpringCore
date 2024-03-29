package com.practice.json;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class ObjectMapperAddRemove {

	public static void main(String[] args) throws IOException {
		System.out.println("Shubham");
		byte[] jsonData = Files.readAllBytes(Paths.get("employee.json"));
		ObjectMapper objectMapper = new ObjectMapper();
		
		//create JsonNode
		JsonNode rootNode = objectMapper.readTree(jsonData);
		System.out.println(rootNode);
		//update JSON data
		((ObjectNode) rootNode).put("id", 500);
		//add new key value
		((ObjectNode) rootNode).put("test", "test value");
		//remove existing key
		((ObjectNode) rootNode).remove("permanent");
		((ObjectNode) rootNode).remove("properties");
		objectMapper.writeValue(new File("employee.json"), rootNode);

	}

}
