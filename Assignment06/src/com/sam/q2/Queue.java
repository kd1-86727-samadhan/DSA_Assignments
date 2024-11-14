package com.sam.q2;


public class Queue {
	private PriorityQueueUsingMaxHeap heap;

	public Queue(int size) {
		heap = new PriorityQueueUsingMaxHeap(size);
	}

	public void push(int value) {
		heap.addHeap(value);
	}

	public int pop() {
		return heap.deleteHeap();
	}

	public int peek() {
		return heap.getMax();
	}

	public boolean isEmpty() {
		return heap.isEmpty();
	}

	public boolean isFull() {
		return heap.isFull();
	}
}

