package com.sam;

public class Question02CountOccurrenceNumber {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 1, 6, 1, 7, 9, 1, 2 };

		countOccurrenceOfNumber(arr);
	}

	private static void countOccurrenceOfNumber(int[] arr) {
		int maxCount = 0;
		int element = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > maxCount) {
				maxCount = count;
				element = arr[i];
			}
		}
		System.out.println("Element with highest occurrence: " + element);
		System.out.println("Max count: " + maxCount);

	}

}
