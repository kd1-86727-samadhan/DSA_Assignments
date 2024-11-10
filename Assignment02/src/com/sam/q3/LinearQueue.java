package com.sam.q3;

public class LinearQueue {
	int arr[];
	int front, rear;
	private final int SIZE;

	public LinearQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == SIZE;
	}

	public void push(int value) {
		if (!isFull()) {
			arr[rear] = value;
			rear++;
		} else {
			System.out.println("Queue is full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int temp = arr[front];
			front++;
			return temp;
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}

	public int peek() {
		if (!isEmpty()) {
			return arr[front];
		} else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
}
