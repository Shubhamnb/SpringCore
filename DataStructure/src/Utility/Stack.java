package Utility;



public class Stack {
	int[] ch;
	public int top, size, l;
	
	public Stack(int n) {
		 top = -1;
		 size = 0;
		 l = n;
		 ch = new int[l];
	}
	public void show() {
		for (int i = 0; i < size; i++) {
			System.out.print(ch[i]+" ");
		}
	}
	/******Method to check Stack is empty or not*******/
	public boolean isEmpty() {
		return size == 0;
	}
	/******Method to check Stack is Full or not*******/
	public boolean isFull() {
		return size == l;
	}
	/******Methode to push element in Stack***********/
	public void push(int chr) {
		if(isFull())
			throw new IllegalStateException("Stack Over_Flow");
		ch[++top] = chr;
		size++;
	}
	/******Methode to pop element in Stack***********/
	public int pop() {
		int temp;
		if(isEmpty())
			throw new IllegalStateException("UnderFlow");
		temp = ch[top];
		top--;
		size--;
		return temp;
	}
	/******Methode to peek element in Stack***********/
	public int peek() {
		if(isEmpty())
			throw new IllegalStateException("Under Flow");
		return ch[top];
	}
}
