package nvhoang_lesson7;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array in sorted order: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int x = sc.nextInt();
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;
        while (lowerBound <= upperBound) {
            int midPoint = lowerBound + (upperBound - lowerBound) / 2;
            if (arr[midPoint] == x) {
                return midPoint;
            } else if (arr[midPoint] < x) {
                lowerBound = midPoint + 1;
            } else {
                upperBound = midPoint - 1;
            }
        }
        return -1;
    }
}
