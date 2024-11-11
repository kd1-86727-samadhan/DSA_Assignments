package com.sam.q3;

import java.util.Scanner;

public class SinglyLinearLLMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		SinglyLinearLinkedList slt = new SinglyLinearLinkedList();
		int choice;

		do {
			System.out.println("----------------------------------------------------");
			System.out.println("0. Exit");
			System.out.println("1. Insert a new data after a given data");
			System.out.println("2. insert a new data before a given data");
			System.out.println("3. Display");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Exit");
			}
				break;

			case 1: {
				System.out.println("1. Insert a new data after a given data");
				System.out.println("Enter the element you want to add: ");
				int element1 = sc.nextInt();

				System.out.println("Enter the element after you want to add: ");

				int element2 = sc.nextInt();
				slt.addAfter(element1, element2);
				// System.out.println(value + " is added successfully");
			}
				break;

			case 2: {
				System.out.println("1. Insert a new data after a given data");
				System.out.println("Enter the element you want to add: ");
				int element1 = sc.nextInt();

				System.out.println("Enter the element before you want to add: ");

				int element2 = sc.nextInt();
				slt.addBefore(element1, element2);
			}
				break;

			case 3:
			{
				slt.display();
			}
			break;
			default:
				System.out.println("Invaild Choice !!!!");
			}
		} while (choice != 0);
	}
}
