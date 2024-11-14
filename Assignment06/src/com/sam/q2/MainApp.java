package com.sam.q2;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue priQue = new Queue(5);
		int choice;

		do {
			System.out.println("-----------------------------------");
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("-----------------------------------");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("0. Exit");

			}
				break;

			case 1: {
				System.out.println("1. Push");
				if (priQue.isFull()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Enter the value: ");
					int value = sc.nextInt();
					priQue.push(value);
					System.out.println(value + " is added sucessfully");
				}
			}
				break;

			case 2: {
				System.out.println("2. Pop");
				if (priQue.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println(priQue.pop() + " is popped");
				}
			}
				break;

			case 3: {
				System.out.println("3. Peek");
				if (priQue.isEmpty()) {
					System.out.println("Queue is empty");
				} else {
					System.out.println("Peek element: " + priQue.peek());
				}
			}
				break;

			default:
				System.out.println("Invalid Choice !!!!");
			}
		} while (choice != 0);
		sc.close();
	}
}
