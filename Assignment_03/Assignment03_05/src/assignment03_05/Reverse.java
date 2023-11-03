package assignment03_05;

import java.util.Stack;

public class Reverse {
	private int arr[];
	private int top;
	private final int SIZE;
	public Reverse(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public Reverse() {
		this.SIZE = 0;
	}

	public void push(int data) {
		top++;
		arr[top] = data;
	}
	
	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE -1;
	}
	
}
