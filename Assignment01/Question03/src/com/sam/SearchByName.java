package com.sam;

import java.util.Arrays;
import java.util.Scanner;

public class SearchByName {

	private static int linearSearchByEmpName(Employee[] earr, String name) {

		for (int i = 0; i < earr.length; i++) {
			if (earr[i].getEname().equals(name)) {
				System.out.println("Employee " + name + " is found at index - " + i);
				return i;
			}
		}
		System.out.println("Employee " + name + " is not found.");
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

		System.out.println("Enter the employee name you want to search: ");
		String name = sc.next();

		linearSearchByEmpName(earr, name);
		sc.close();
	}

}
