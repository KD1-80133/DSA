package queue;

public class Queue {
	List l1;
	Queue()
	{
		l1=new List();
	}
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	public void push(int value)
	{
		l1.addFirst(value);
	}
	public void pop()
	{
		l1.deleteLast();
	}
	public int peek()
	{
		return l1.getData();
	}
	public void printQueue()
	{
		l1.display();
	}

}
