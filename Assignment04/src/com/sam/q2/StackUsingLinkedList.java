package com.sam.q2;

public class StackUsingLinkedList {

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	} // Node

	private Node top;

	public StackUsingLinkedList() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int value) {
		Node newnode = new Node(value);
		newnode.next = top;
		top = newnode;
	}

	public int pop() {
		int temp = top.data;
		top = top.next;
		return temp;
	}

	public int peek() {
		return top.data;
	}

	public void display() {
		Node trav = top;
		System.out.println("Stack: ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
	}
}
