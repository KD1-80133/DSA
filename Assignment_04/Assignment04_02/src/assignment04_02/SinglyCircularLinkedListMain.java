package assignment04_02;

public class SinglyCircularLinkedListMain {

	public static void main(String[] args) {
		SinglyCircularLinkedList l1=new SinglyCircularLinkedList();
		
		l1.addFirst('a');
		l1.addFirst('b');
		l1.addFirst('c');
		l1.addFirst('d');
		l1.addFirst('e');
		l1.addFirst('f');
		l1.addFirst('g');
		l1.addFirst('h');
		
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.addLast('z');
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.addPosition('@', 3);
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.deleteFirst();
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.deleteLast();
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		l1.deletePosition(4);
		l1.displayList();
		System.out.println("Node count :"+l1.getCount());
		
		
	}

}
