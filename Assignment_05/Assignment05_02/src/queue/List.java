package queue;

public class List {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		}
		else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
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
	int getData()
	{
		return head.data;
	}
}
