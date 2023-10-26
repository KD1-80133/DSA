package assignment01_01;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int size, int[] comparison) {
        int left = 0;
        int right = size - 1;
        int comp = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            comp++;
            if (key == arr[mid]) {
                comparison[0] = comp;
                return mid;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        comparison[0] = comp;
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key = scanner.nextInt();

        int[] comparison = new int[1];
        int index = binarySearch(arr, key, n, comparison);

        if (index != -1) {
            System.out.println("Key is found at index " + index);
            System.out.println("Number of comparisons: " + comparison[0]);
        } else {
            System.out.println("Key is not found");
            System.out.println("Number of comparisons: " + comparison[0]);
        }

        scanner.close();
    }
}
