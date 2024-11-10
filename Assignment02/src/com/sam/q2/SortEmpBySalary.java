package com.sam.q2;

import java.util.Arrays;
import java.util.Scanner;

public class SortEmpBySalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		
		Employee[] emp = new Employee[size];

		System.out.println("Enter the employee details: ");
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee();
			emp[i].acceptEmployee(sc);
		}

		for (Employee e : emp)
			System.out.println(e);
		System.out.println();

		empSearchBySalary(emp);
		System.out.println("Employee After salary sort");
		for (Employee e : emp)
			System.out.println(e);
		System.out.println();
	}

	private static void empSearchBySalary(Employee[] emp) {

		for (int i = 0; i < emp.length; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].salary > emp[j].salary) {
					double temp = emp[i].salary;
					emp[i].salary = emp[j].salary;
					emp[j].salary = temp;
				}

			}
		}
	}
}
