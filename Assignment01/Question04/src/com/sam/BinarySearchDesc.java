package com.sam;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDesc {

	public static int binarySearchComparison(int[] arr, int key) {
		int mid, left = 0, right = arr.length - 1;
		while (left <= right) {
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key < arr[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the array element: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elements " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements: " + Arrays.toString(arr));

		System.out.println("Enter the element you want to search: ");
		int key = sc.nextInt();

		int index = binarySearchComparison(arr, key);
		if (index == -1)
			System.out.println(key + " is not found.");
		else
			System.out.println(key + " is found at index-" + index);

	}

}
