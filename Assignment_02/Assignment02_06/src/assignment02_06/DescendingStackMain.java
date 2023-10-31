package assignment02_06;

import java.util.Scanner;
import java.util.Stack;

public class DescendingStackMain {

	public static void main(String[] args) {
		DescendingStack stack = new DescendingStack(4);		
		int choice;
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("--------menu-------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.Display");
			System.out.println("0.Exit");
			System.out.println("Enter your choice...");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				if(stack.isFull())	
					System.out.println("Stack is Full");
				else 
				{
					System.out.println("Enter the data : ");
					int data=scanner.nextInt();
					stack.push(data);
				}
				break;
			case 2:
				if(stack.isEmpty())
					System.out.println("Stack is Empty");
				else
				{
					System.out.println("Poped data="+stack.pop());
				}
				break;
			case 3:
				if(stack.isEmpty())
					System.out.println("Stack is empty");
				else
				{
					System.out.println("Peeked data="+stack.peek());
				}
				break;
			case 4:
				stack.display();
				break;
		    }
		}while(choice!=0);
		scanner.close();

	}

}
