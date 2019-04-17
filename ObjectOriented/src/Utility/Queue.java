package Utility;

import com.bridge.deckcard.linklist.LinkList;
import com.bridge.deckcard.linklist.LinkedListNode;

public class Queue {
	int size;
	LinkList<String> list;
	
	public Queue() {
		list = new LinkList<String>();
		size = 0;
	}
	
	public void enQueue(String str) {
		list.insertLast(new LinkedListNode<String>(str));
		size++;
	}
	
	public String deQueue() {
		if(size == 0)
			return null;
		size--;
		String str = list.remove();
		return str;
	}
}
