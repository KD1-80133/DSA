package assignment04_01;

public class LinearLinkedListMain {

	public static void main(String[] args) {
		LinearLinkedList l1 = new LinearLinkedList();
		
		l1.addFirst(60);
		l1.addFirst(50);
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		
		l1.display();
		
		l1.addLast(70);
		
		l1.display();
		
		l1.deleteFirst();
		
		l1.display();
		
		l1.deleteLast();
		
		l1.display();
		
		

	}

}
