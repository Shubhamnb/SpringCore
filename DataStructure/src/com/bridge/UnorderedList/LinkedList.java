package com.bridge.UnorderedList;

import com.bridge.UnorderedList.Node;

public class LinkedList {
	Node head;
	
	
	/*
	 * 
	 * @@Method to add Node at Beginning of the list
	 * 
	 * 
	 * */
	 void add(String str) {
		Node node = new Node(str, null);
		if(head == null) {
			head = node;
		}else {
			node.next = head;
			head = node;
		}
	}
	
	 
	 /*
		 * 
		 * @@Method to add Node at Ending of the list
		 * 
		 * 
		 * */
	 public void addLast(String str) {
			Node node = new Node(str, null);
			if(head == null) {
				head = node;
			}else {
				Node temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next = node;
			}
		}
	
	
	/*
	 * 
	 * @@Method to Search a element in a list
	 * 
	 * 
	 * */
	 public boolean search(String str) {
		Node temp = head;
		do {
			if(temp.data.equalsIgnoreCase(str)) {
				return true;
			}
			temp = temp.next;
		}while(temp.next != null);
		if(temp.data.equalsIgnoreCase(str)) {
			return true;
		}
		return false;
	}
	
	
	/*
	 * 
	 * @@Method to Show a element in a list
	 * 
	 * 
	 * */
	public void show() {
		if(head == null) {
			System.out.println("List is empty ");
		}else {
			Node temp;
			temp = head;
			while(temp.next != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
	
		/*
		 * 
		 * @@Method to Remove a element in a list
		 * 
		 * 
		 * */
	 public void remove(String data) {
			Node ptr1, ptr2;
			ptr1 = ptr2 = head;
			if (ptr1 == null) {
				System.err.println(" Underflow ");
			} else {
				while (ptr1.next != null) {
					if (ptr1.next == null) {
						head = null;
					} else {
						if (ptr1 == ptr2 && ptr2.data.equalsIgnoreCase(data)) {
							head = ptr1.next;
						}
						if (ptr2.data.equalsIgnoreCase(data)) {
							ptr1.next = ptr2.next;
						}
						ptr1 = ptr2;
						ptr2 = ptr1.next;
					}
				}
			}

		}
	
	 
	 /*
		 * 
		 * @@Method to Remove Node at LAST of the list
		 * 
		 * 
		 * */
		public void removeLast() {
			if(head == null) {
				System.out.println("List is Empty");
			}else {
				Node ptr1, ptr2 = null;
				ptr1 = head;
				while(ptr1.next != null) {
					ptr2 = ptr1;
					ptr1 = ptr1.next;
				}
				ptr2.next = null;
			}
		}
	
}
