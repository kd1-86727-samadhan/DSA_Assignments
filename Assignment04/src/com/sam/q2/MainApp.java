package com.sam.q2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackUsingLinkedList slt = new StackUsingLinkedList();
		int choice;

		do {
			System.out.println("\n----------------");
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("----------------");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Exit");
			}
				break;

			case 1: {
				System.out.println("Enter the value: ");
				int value = sc.nextInt();
				slt.push(value);
				System.out.println(value + " is added succesfully");
			}
				break;

			case 2: {
				if (slt.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					System.out.println(slt.pop() + " is popped");
				}
			}
				break;

			case 3: {
				if (slt.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Peek element: " + slt.peek());
				}
			}
				break;

			case 4: {
				if (slt.isEmpty()) {
					System.out.println("List is empty");
				} else {
					slt.display();
				}
			}
				break;

			default:
				System.out.println("Invalid choice !!!!");
			} // switch
		} while (choice != 0);

	}

}
