package com.bridge.UnorderedList;

public class Node {
	String data;
	Node next;
	
	//Constructor
	public Node(String data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	/*******************Gettter and Setter********************/
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
