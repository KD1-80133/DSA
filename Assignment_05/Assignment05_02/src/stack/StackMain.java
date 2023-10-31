package stack;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Stack stack=new Stack();
		Scanner scanner =new Scanner(System.in);
		
		int choice;
		do
		{
			System.out.println("-------Menu--------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Print");
			System.out.println("5.Exit");
			System.out.println("Enter your choice :");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter a value to push :");
				int value=scanner.nextInt();
				stack.push(value);
				break;
			case 2:
				stack.pop();
				System.out.println("Popped the top elment.");
				break;
			case 3:
				int topValue=stack.peek();
				System.out.println("Top elment :"+topValue);
				break;
			case 4:
				stack.printStack();
				break;
			default:
				System.out.println("Invalid choice....");
				break;
			}
		}while(choice!=0);
	}

}
