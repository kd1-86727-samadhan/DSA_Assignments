package com.sam.q2;

public class CircularQueue {
	int arr[];
	int front, rear, count;
	private final int SIZE;

	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		count = 0;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public boolean isFull() {
		return count == SIZE;
	}

	public void push(int value) {
		// 1. Reposition rear (increment)
		rear = (rear + 1) % SIZE;

		// 2. Add value at rear index
		arr[rear] = value;
		count++;
	}

	public int pop() {
		int temp = arr[(front + 1) % SIZE];

		// 1. Reposition front (increment)
		front = (front + 1) % SIZE;

		// 2. If front and rear are equal move them back to -1
		if (front == rear)
			front = rear = -1;

		count--;
		return temp;
	}

	public int peek() {
		// 1. read and data of front end
		return arr[(front + 1) % SIZE];
	}
}
