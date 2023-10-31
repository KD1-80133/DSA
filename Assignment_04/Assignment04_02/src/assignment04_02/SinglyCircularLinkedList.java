package assignment04_02;

public class SinglyCircularLinkedList {
	public class Node{
		private char data;
		private Node next;
		public Node(char value) 
		{
			data=value;
			next=null;
		}
	}
	private Node tail;
	private int count;
	public SinglyCircularLinkedList() {
		tail=null;
		count=0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		return tail==null;
	}
	
	//add first
	public void addFirst(char value)
	{
		Node newnode= new Node(value);
		if(isEmpty())
		{
			tail=newnode;
			tail.next=tail;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			
		}
		count++;
	}
	// add last
	public void addLast(char value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			tail=newnode;
			tail.next=tail;
		}
		else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		count++;
	}
	
	public void addPosition(char value,int pos)
	{
		if(pos<1 || pos>count+1)
			return;
		Node newnode=new Node(value);
		
		if(isEmpty())
		{
			tail=newnode;
			tail.next=tail;
		}
		else if(pos==1)
		{
			addFirst(value);
		}
		else
		{
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			newnode.next=trav.next;
			trav.next=newnode;
			if(pos==count+1)
			{
				tail=newnode;
			}
		}
		count++;
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		} 
		else if(tail.next==tail)
		{
			tail=null;
		}
		else
		{
			tail.next=tail.next.next;
		}
		count--;
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		}
		else if(tail.next==tail)
		{
			tail=null;
		}
		else
		{
			Node trav=tail.next;
			while(trav.next!=tail)
			{
				trav=trav.next;
			}
			trav.next=tail.next;
			tail=trav;
		}
		count--;
	}
	
	public void deletePosition(int pos)
	{
		if(pos<1||pos>count)
		return;
		
		if(isEmpty())
		{
			System.out.println("List is empty");
			return;
		}
		else if(pos==1)
		{
			deleteLast();
		}
		else
		{
			Node trav=tail.next;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			trav.next=trav.next.next;
			count--;
		}
	}
	
	public void displayList()
	{
		if(isEmpty())
			return;
		
		System.out.println("List :");
		Node trav =tail.next;
		do
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}while(trav!=tail.next);
		System.out.println("");
	}
	

}
