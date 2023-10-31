package assignment05_01;

public class DoublyCircularLinkedListMain {

	public static void main(String[] args) {
		DoublyCircularLinkedList list=new DoublyCircularLinkedList();
		list.addNode(80);
		list.addNode(70);
		list.addNode(60);
		list.addNode(50);
		list.addNode(40);
		list.addNode(30);
		list.addNode(20);
		list.addNode(10);
		System.out.println("Original List :");
		list.display();
		
		System.out.println("--------Add at position----------");
		list.addPosition(90, 1);
		list.display();
		
		System.out.println("--------Delete at position----------");
		list.deletePosition(1);
		list.display();
	}

}
