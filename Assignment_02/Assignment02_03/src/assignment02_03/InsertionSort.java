package assignment02_03;
import java.util.*;
public class InsertionSort {
	public static void insertionSort(int arr[],int N)
	{
		int count = 0;
        int passes = 0;
		for(int i=1;i<N;i++)
		{
			passes++;
			int temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>temp)
			{
				
				
				arr[j+1]=arr[j];
				j--;
				count++;
			}

			arr[j+1]=temp;
		}
		System.out.println("No of comparisons: " + count);
        System.out.println("No of passes: " + passes);
	}

	public static void main(String[] args) {
		int arr[]= {24, 19, 21, 13, 14, 18, 20};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}

}
