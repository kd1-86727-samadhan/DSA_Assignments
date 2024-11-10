package com.sam.q1;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDesc {
	private static void insertionSortByDesc(int[] arr) {
		
		for(int i = 1; i < arr.length;i++)
		{
			int j;
			int temp = arr[i];
			
			for(j = i - 1; j >= 0 && arr[j] < temp; j--)
			{
				arr[j+1] = arr[j];
			}
			
			arr[j + 1] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		System.out.println("Enter the size of an a array: ");
		int n = sc.nextInt();

		arr = new int[n];
		System.out.println("Enter the elements of an array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Elements " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Before sorting: " + Arrays.toString(arr));
		insertionSortByDesc(arr);
		System.out.println("After sorting: " + Arrays.toString(arr));
		sc.close();
	}



}
