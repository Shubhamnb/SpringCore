package com.bridge.LinkedListComDataPro;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class MainStockClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		ReadJson readJson = new ReadJson();
		readJson.addToLinkedList();
	}

}
