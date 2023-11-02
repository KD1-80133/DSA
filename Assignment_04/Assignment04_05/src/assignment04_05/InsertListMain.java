package assignment04_05;

public class InsertListMain {

	public static void main(String[] args) {
		InsertList l1=new InsertList();
		
		l1.addNode(1);
		l1.addNode(2);
		l1.addNode(3);
		l1.addNode(4);
		l1.addNode(5);
		
		System.out.println("Original List :");
		l1.display();
		
		System.out.println("---------------------");
		l1.insertAfter(9);
		System.out.println("Before Given Node :");
		l1.display();
		
		System.out.println("----------------------");
		l1.addAfter(6);
		System.out.println("After Given Node :");
		l1.display();
		
		
	}

}
