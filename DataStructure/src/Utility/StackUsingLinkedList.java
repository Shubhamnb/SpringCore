package Utility;

import com.bridge.OrderedList.LinkedList1;

public class StackUsingLinkedList {
	LinkedList1 list = new LinkedList1();
	int size = 0;
	public void push(int i) {
		list.add(i);
		size++;
	}

	public int pop() {
		size--;
		return list.removeLast();
	}
	
	public boolean isEmpty() {
		if(list.isEmpty())
			return true;
		return false;
	}
}
