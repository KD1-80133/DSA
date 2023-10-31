package deque;

public class Deque {
	List l1;
	Deque()
	{
		l1=new List();
	}
	public boolean isEmpty()
	{
		return l1.isEmpty();
	}
	public void pushf(int value)
	{
		l1.addFirst(value);
	}
	public void pushl(int value)
	{
		l1.addLast(value);
	}
	public void pop()
	{
		l1.deleteFirst();
	}
	public int peek()
	{
		return l1.getData();
	}
	public void printDeque()
	{
		l1.display();
	}
}
