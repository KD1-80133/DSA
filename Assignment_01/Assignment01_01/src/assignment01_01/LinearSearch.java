package assignment01_01;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int[] arr,int key,int[] comparison)
	{
		int comp=0;
		for(int i=0;i<arr.length;i++)
		{
			comp++;
			if(arr[i]==key)
			{
				
				comparison[0] = comp; 
				return i;
			}
		}
		comparison[0] = comp;
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of element of the array:");
		int n=scanner.nextInt();
		
		int[] arr=new int[n];
		System.out.println("Enter the element of the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter the key to search :");
		int key=scanner.nextInt();
		
		int[] comparison=new int[1];
		int index=linearSearch(arr,key,comparison);
		if(index>=0)
		{
			System.out.println("key found at index:"+index);
			System.out.println("Number of comparison :"+comparison[0]);
		}
		else
		{
			System.out.println("Key is not found...");
			System.out.println("Number of comparison :"+comparison[0]);
		}
	}

}
