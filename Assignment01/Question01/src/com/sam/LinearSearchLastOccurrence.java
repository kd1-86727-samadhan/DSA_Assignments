package com.sam;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchLastOccurrence {

	public static int LinearSearchLastOccurrence(int arr[], int key) {

		for (int i = arr.length - 1; i > 0; i--) {
			if (key == arr[i])
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = null;

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elements " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements: " + Arrays.toString(arr));
		System.out.println("Enter the key you want to search: ");
		int key = sc.nextInt();

		int index = LinearSearchLastOccurrence(arr, key);
		if (index == -1)
			System.out.println(key + " is not found");
		else
			System.out.println("Last occurrence of key" + key + " is found at index -" + index);

	}

}
