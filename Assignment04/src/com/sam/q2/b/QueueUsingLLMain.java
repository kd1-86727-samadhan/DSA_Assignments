package com.sam.q2.b;

import java.util.Scanner;

public class QueueUsingLLMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		QueueUsingLL q = new QueueUsingLL();
		int choice;

		do {
			System.out.println("\n---------------------");
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("---------------------");
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
				q.push(value);
				System.out.println(value + " is added successfully");
			}
				break;

			case 2: {
				if (q.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println(q.pop() + " is popped");
				}
			}
				break;

			case 3: {
				if (q.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Peek value: " + q.pop());
				}
			}
				break;

			case 4: {
				q.display();
			}
				break;

			default:
				System.out.println("Invaild Choice");
			} // choice
		} while (choice != 0);
	}

}
