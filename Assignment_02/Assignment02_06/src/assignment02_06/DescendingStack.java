package assignment02_06;

public class DescendingStack {
	private int arr[];
	private int top;
	private final int SIZE;

	public DescendingStack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int data)
	{
		top++;
		arr[top]=data;
	}
	public int pop()
	{
		int data=arr[top];
		top--;
		return data;
	}
	public int peek()
	{
		return arr[top];
	}

	public boolean isEmpty() {
		return top == SIZE;
	}

	public boolean isFull() {
		return top == SIZE-1;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			System.out.println("Stack element :");
			for(int i=top;i<SIZE-1;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Stack is empty...");
		}
	}
}
