package com.sam.q3;

import java.util.Scanner;

public class LinearQueueMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an queue: ");
		int n = sc.nextInt();

		LinearQueue q = new LinearQueue(n);

		int choice;

		do {
			System.out.println("---------------------------");
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.println("---------------------------");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Exit");
			}
				break;

			case 1: {
				if (q.isFull()) {
					System.out.println("Queue is full");
				} else {
					System.out.println("Enter the value: ");
					int value = sc.nextInt();
					q.push(value);
					System.out.println(value + " is added successfully");
				}
			}
				break;

			case 2: {
				if (q.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println(q.pop() + " is popped.");
				}
			}
				break;

			case 3: {
				if (q.isEmpty()) {
					System.out.println("Queue is empty.");
				} else {
					System.out.println("Peek element: " + q.peek());
				}
			}
				break;

			default:
				System.out.println("Invaild Choice !!!!");
			} // switch
		} while (choice != 0);
		sc.close();
	}

}
