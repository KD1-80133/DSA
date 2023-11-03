package assignment03_02;

import java.util.Scanner;

public class MaxStackMain {

	public static void main(String[] args) {
		MaxStack stack=new MaxStack(4);
		int key=0;
		Scanner scanner=new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("---------Menu----------");
			System.out.println("0.Exit");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("4.Show Max");
			System.out.println("Enter your choice : ");
			choice=scanner.nextInt();
			
			switch(choice)
			{
			case 1:
				if(stack.isFull())
					System.out.println("Stack is full..");
				else
				{
					System.out.println("Enter data : ");
					int data=scanner.nextInt();
					stack.push(data);
					if(data>key)
					{
						key=data;
					}
				}
				break;
			case 2:
				if(stack.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped data : "+stack.pop());
				break;
			case 3:
				if(stack.isEmpty())
					System.out.println("Stack is empty...");
				else
					System.out.println("Peeked data : "+stack.peek());
				break;
			case 4:
				System.out.println("Max element : "+key);
				break;
			}
		}while(choice!=0);
	}
	
}
