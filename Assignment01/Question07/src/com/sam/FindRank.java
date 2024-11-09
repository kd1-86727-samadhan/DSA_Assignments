package com.sam;

import java.util.Arrays;
import java.util.Scanner;

public class FindRank {
	private static void findRank(int[] arr, int element) {
		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= element)
				rank++;
		}
		System.out.println("Rank of " + element + " is " + rank);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();

		arr = new int[n];

		System.out.println("Enter the array element: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements: " + Arrays.toString(arr));
		System.out.println("Enter the element: ");
		int element = sc.nextInt();

		findRank(arr, element);

	}

}
