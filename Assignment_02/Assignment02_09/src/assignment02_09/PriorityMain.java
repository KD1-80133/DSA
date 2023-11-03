package assignment02_09;

import java.util.Scanner;

public class PriorityMain {
	public static int prio(char opr)
	{
		switch(opr) 
		{
		case '$':
			return 3;
		case '/':
			return 2;
		case '%':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return 0;

	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter operator =");
		char choice =scanner.next().charAt(0);
		System.out.println("Priority of "+choice+"Operator ="+prio(choice));
	}

}
