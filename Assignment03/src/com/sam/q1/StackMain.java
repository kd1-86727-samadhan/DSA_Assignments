package com.sam.q1;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack: ");
		int size = sc.nextInt();

		Stack st = new Stack(size);
		
		ReverseStack rvstk = new ReverseStack(size);

		int choice;

		do {
			System.out.println("--------------------");
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.println("--------------------");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Exit");
			}
				break;

			case 1: {
				if (st.isFull()) {
					System.out.println("Stack is full");
				} else {
					System.out.println("Enter the value: ");
					int value = sc.nextInt();

					st.push(value);
					System.out.println(value + " is added successfully.");
				}
			}
				break;

			case 2: {
				if (st.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					int poppedElement = st.pop();
					System.out.println("Popped Element: " + poppedElement);
					rvstk.pushReverse(poppedElement);
				}
			}
				break;

			case 3: {
				if (st.isEmpty()) {
					System.out.println("Stack is empty");
				} else {
					System.out.println("Peek Element: " + st.peek());
				}
			}
				break;

			default:
				System.out.println("Invalid Choice !!!!");
				break;
			} // switch
		} while (choice != 0);
		
		st.display();
		rvstk.displayReverse();

		sc.close();
	}

}
