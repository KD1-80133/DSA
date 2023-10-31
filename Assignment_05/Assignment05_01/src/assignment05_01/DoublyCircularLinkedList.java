package assignment05_01;

public class DoublyCircularLinkedList {
	public class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data=value;
			next=null;
			prev=null;
		}
	}
	private Node head;
	private int count;
	
	public DoublyCircularLinkedList()
	{
		head=null;
		count=0;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addNode(int value)
	{
		
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=newnode;
			head.next=newnode;
			head.prev=newnode;
		}
		else
		{
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
			head=newnode;
		}
		count++;
	}
	
	public void addPosition(int value,int pos)
	{
		if((pos<1||pos>count+1))
			return;
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=newnode;
			head.next=head;
			head.prev=head;
		}
		else if(pos==1)
		{
			addNode(value);
			return;
		}
		else
		{
			Node trav=head;
			for(int i=1;i<pos-1;i++)
				trav=trav.next;
			newnode.next=trav.next;
			newnode.prev=trav;
			trav.next.prev=newnode;
			trav.next=newnode;
		}
		count++;
	}
	
	
	public void deletePosition(int pos)
	{
		if(isEmpty())
			return;
		else if(head.next==head)
			head=null;
		else
		{
			Node trav = head;
			for(int i=1;i<pos;i++)
				trav=trav.next;
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
			if(trav==head)
			{
				head=trav.next;
			}
		}
	}
	
	public void display()
	{
		if(isEmpty()) {
			return;
		}
		System.out.print("List :");
		Node trav=head;
		do 
		{
			System.out.print(" "+trav.data);
			trav=trav.next;
		}while(trav!=head);
		System.out.println("");
	}
	
}





