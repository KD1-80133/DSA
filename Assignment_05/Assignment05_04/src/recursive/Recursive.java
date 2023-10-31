package recursive;

public class Recursive {
	public class Node
	{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			data=value;
			left=null;
			right=null;
		}
	}
	
	private Node root;
	
	public Recursive()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	private void addNode(int value)
	{
		root= recursive(root,value);
	}
	
	private Node recursive(Node trav,int value)
	{
		if(trav==null)
		{
			return new Node(value);
		}
		if(value<trav.data)
		{
			trav.left=recursive(trav.left)
		}
	}
}
