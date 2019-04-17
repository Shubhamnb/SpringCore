package com.bridge.LinkedListComDataPro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridge.LinkedListComDataPro.CompanyStock;
import com.bridge.commercialdataprosessing.CommercialUserProj;

import Utility.LinkedList;

public class ReadJson {
	

	
	public void addToLinkedList() throws FileNotFoundException, IOException, ParseException {
		LinkedList list = new LinkedList();
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(new File("companyStock.json"));
        JsonNode inventry = rootNode.get("StockDetails");
        
        CompanyStock[] companyStocks = mapper.readValue(inventry, CompanyStock[].class);
        for (CompanyStock companyStock : companyStocks) {
			//list.add(companyStock);
		}
	}
	

}
