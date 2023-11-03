package assignment03_05;

import java.util.*;
public class ReverseMain {

	public static void main(String[] args) {
		Reverse re = new Reverse(5);
		int[] arr= {10,20,30,40,50};
		System.out.println("Before reversing:"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			re.push(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=re.pop();
		}
		System.out.println("After reversing:"+Arrays.toString(arr));

	}

}
