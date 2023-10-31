package stack;

public class Stack {
	List l1;
	Stack()
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
		l1.deleteFirst();
	}
	public int peek()
	{
		return l1.getData();
	}
	public void printStack() {
       l1.display();
    }
}
