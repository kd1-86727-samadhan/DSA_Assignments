package com.sam;

import java.util.Scanner;

public class LinearSearchComparison {

	private static int linearSearch(int[] arr, int key) {
		int comparison = 0;
		for (int i = 0; i < arr.length; i++) {
			comparison++;
			if (key == arr[i]) {
				System.out.println("Number of comparison: " + comparison);
				return i;
			}

		}
		System.out.println("Number of comparison: " + comparison);
		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 11, 22, 8, 5, 2, 6, 42, 35, 69, 84 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the key you want search: ");
		int key = sc.nextInt();

		int index = linearSearch(arr, key);
		if (index == -1)
			System.out.println("Key is not found.");
		else
			System.out.println("Key is found at index - " + index);

		sc.close();

	}

}
