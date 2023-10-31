package assignment03_02;

public class MaxStack {
	private int arr[];
	private int top;
	private final int SIZE;
	private int max;
	
	public MaxStack(int size)
	{
		SIZE=size;
		arr=new int[SIZE];
		top=-1;
	}
	public void push(int data)
	{
		if(top+1<SIZE)
		{
			top++;
			arr[top]=data;
			if(data>max)
			{
				max=data;
			}
		}
		else
		{
			System.out.println("Stack is full..");
		}
	}
	public int pop()
	{
		if(top>=0)
		{
			int data=arr[top];
			top--;
			if(data==max)
			{
				findNewMax();
			}
			return data;
		}
		else
		{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public int peek()
	{
		if(top>=0)
		{
			return arr[top];
		}
		else
		{
			System.out.println("Stack is empty..");
			return -1;
		}
	}

}
