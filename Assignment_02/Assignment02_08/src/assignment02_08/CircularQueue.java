package assignment02_08;

public class CircularQueue {
	private int arr[];
	private int rear, front;
	private int count;
	private final int SIZE;
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		count=0;
	}
	public void push(int data) {
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
		count++;
		}
	
	public void pop() {
		front = (front + 1) % SIZE;
		count--;
		if(front == rear)
			front = rear = -1;
		
	}
	
	public int peek() {
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
	
	public boolean isEmpty() {
		return count==SIZE;
	}


}
