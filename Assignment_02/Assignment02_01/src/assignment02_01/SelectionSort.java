package assignment02_01;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int arr[], int N) {
        int count = 0;
        int passes = 0;
        for (int i = 0; i < N - 1; i++) {
            passes++;
            for (int j = i + 1; j < N; j++) {
                count++;
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("No of comparisons: " + count);
        System.out.println("No of passes: " + passes);
    }

    public static void main(String[] args) {
        int arr[] = {31, 13, 41, 21, 44, 55};
        System.out.println("Array before sort: " + Arrays.toString(arr));
        selectionSort(arr, arr.length);
        System.out.println("Array After sort: " + Arrays.toString(arr));
    }
}
