package com.sam;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingElement {

	private static int nonRepeatingElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count == 1)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[];

		System.out.println("Enter the size of an array: ");
		int n = sc.nextInt();

		arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elemet " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array elements are: " + Arrays.toString(arr));

		int element = nonRepeatingElement(arr);
		if (element == -1)
			System.out.println("Non repeating element is not found.");
		else
			System.out.println("First non repeating element: " + element);
	}

}
