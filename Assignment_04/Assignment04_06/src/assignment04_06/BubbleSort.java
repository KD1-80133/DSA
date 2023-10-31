package assignment04_06;

public class BubbleSort {
	private class Node
	{
		int data;
		Node next;
		
		Node(int value)
		{
			data=value;
			next=null;
		}
	}
	private Node head;
	private int size;
	
	public BubbleSort()
	{
		head=null;
		size=0;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addNode(int data)
	{
		Node newnode=new Node(data);
		if(isEmpty())
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void bubbleSort(int arr[],int N)
	{
		
	}

}
