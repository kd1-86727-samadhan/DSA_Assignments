package com.sam.q1;


import java.util.LinkedList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackUsingSinglyCircularLL lt = new StackUsingSinglyCircularLL();

		int choice;

		do {
			System.out.println("\n-------------------------");
			System.out.println("0. Exit");
			System.out.println("1. Add at First");
			System.out.println("2. Add at Last");
			System.out.println("3. Add at Position");
			System.out.println("4. Display");
			System.out.println("5. Delete at First");
			System.out.println("6. Delete at Last");
			System.out.println("7. Delete from Position");
			System.out.println("-------------------------");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("0. Exit");
			}
				break;

			case 1: {
				System.out.println("1. Add at First");
				System.out.println("Enter the value: ");
				int value = sc.nextInt();
				lt.addFirst(value);
				System.out.println(value + " is added successfully....");
				System.out.println("Size: " + lt.size());
			}
				break;

			case 2: {
				System.out.println("2. Add at Last");
				System.out.println("Enter the value: ");
				int value = sc.nextInt();
				lt.addLast(value);
				System.out.println(value + " is added at last successfully....");
				System.out.println("Size: " + lt.size());
			}
				break;

			case 3: {
				System.out.println("3. Add at Position");
				System.out.println("Enter the value : ");
				int value = sc.nextInt();

				System.out.println("Enter the position : ");
				int pos = sc.nextInt();

				lt.addAtPosition(value, pos);
			}
				break;

			case 4: {
				System.out.println("4. Display");
				lt.display();

			}
				break;

			case 5: {
				System.out.println("5. Delete at First");
				lt.deleteFirst();
				lt.display();
			}
				break;

			case 6: {
				System.out.println("6. Delete at Last");
				lt.deleteLast();
				lt.display();
			}
				break;

			case 7: {
				System.out.println("Enter the position you want to delete: ");
				int pos = sc.nextInt();
				lt.deleteAtPosition(pos);
				lt.display();
			}
			break;

			default:
				System.out.println("Invalid Choice !!!!");
				break;
			} // switch
		} while (choice != 0);
	}

}
