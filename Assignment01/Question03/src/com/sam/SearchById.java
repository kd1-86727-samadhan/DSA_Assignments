package com.sam;

import java.util.Arrays;
import java.util.Scanner;

public class SearchById {
	public static int linearSearchByEmpId(Employee[] earr, int ele) {

		for (int i = 0; i < earr.length; i++) {
			if (ele == earr[i].getEmpId()) {
				System.out.println("Employee id is found at index - " + i);
				return i;
			}
		}
		System.out.println("Employee id is not found.");
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee earr[] = new Employee[2];

		for (int i = 0; i < earr.length; i++) {
			earr[i] = new Employee();
			earr[i].acceptEmployee(sc);
		}
		System.out.println("Employee: " + Arrays.toString(earr));

		System.out.println("Enter the employee id you want to search: ");
		int element = sc.nextInt();

		linearSearchByEmpId(earr, element);
		sc.close();
	}

}
