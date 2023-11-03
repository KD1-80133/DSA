package deque;

import java.util.Scanner;

public class DequeMain {

	public static void main(String[] args) {
		Deque deque=new Deque();
Scanner scanner =new Scanner(System.in);
		
		int choice;
		do
		{
			System.out.println("-------Menu--------");
			System.out.println("1.Push first");
			System.out.println("2.Push last");
			System.out.println("3.Pop");
			System.out.println("4.Peek");
			System.out.println("5.Print");
			System.out.println("6.Exit");
			System.out.println("Enter your choice :");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter a value to push first :");
				int value=scanner.nextInt();
				deque.pushf(value);
				break;
			case 2:
				System.out.println("Enter a value to push last :");
				int value1=scanner.nextInt();
				deque.pushl(value1);
				break;
			case 3:
				deque.pop();
				System.out.println("Popped the top elment.");
				break;
			case 4:
				int topValue=deque.peek();
				System.out.println("Top elment :"+topValue);
				break;
			case 5:
				deque.printDeque();
				break;
			default:
				System.out.println("Invalid choice....");
				break;
			}
		}while(choice!=0);
	}

}
