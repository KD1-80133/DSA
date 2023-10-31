package assignment04_05;


public class InsertList {
    private class Node {
        int data; 
        Node next;

        public Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node head;
    private Node tail;  

    public InsertList() {
        head = null;
        tail=null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addNode(int data) {
        Node newnode = new Node(data);
        if (isEmpty()) {
            head = newnode;
            
        } else {
        	newnode.next=head;
        	head=newnode;
            
        }
    }
    
    public void insertAfter(int pos,int value)
    {
    	Node newnode=new Node(value);
    	if(isEmpty()) {
    		head=newnode;
    	}
    	else if(pos<=1) {
    		newnode.next=head;
    		head=newnode;
    	}
    	else
    	{
    		Node trav=head;
    		for(int i=1;i<pos-1&&trav.next!=null;i++)
    			trav=trav.next;
    	}
    		
    }
   
    public void display()
    {
    	Node trav=head;
    	System.out.print("List :");
    	while(trav!=null)
    	{
    		System.out.print(trav.data+" ");
    		trav=trav.next;
    	}
    	System.out.println();
    }
}
