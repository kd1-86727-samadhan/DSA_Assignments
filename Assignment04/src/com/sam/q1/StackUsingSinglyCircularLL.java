package com.sam.q1;

public class StackUsingSinglyCircularLL {
	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	} // Node

	private Node tail;
	private int size;

	public StackUsingSinglyCircularLL() {
		tail = null;
		size = 0;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public int size() {
		return size;
	}

	public void deleteAll() {
		tail = null;
		size = 0;
	}

	public void addFirst(int value) {
		// 1. Create the new node first
		Node newnode = new Node(value);
		// If list is empty
		if (size == 0) {
			tail = newnode;
			tail.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
		}
		size++;
	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (size == 0) {
			tail = newnode;
			tail.next = newnode;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		size++;
	}

	public void addAtPosition(int pos, int value) {
		// Validate
		if (pos < 1 || pos > size + 1) {
			System.out.println("Invalid position");
			return;
		}

		Node newnode = new Node(value);
		if (size == 0) {
			tail = newnode;
			tail.next = newnode;
		} else if (pos == 1) {
			addFirst(value);
		} else if (pos == size + 1) {
			addLast(value);
		} else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
		size++;
	}

	public void deleteFirst() {
		// If list is empty
		if (size == 0) {
			System.out.println("LinkedList is empty");
			return;
		}

		if (size == 1) {
			tail = null;
		} else {
			tail.next = tail.next.next;
		}
		size--;
	}

	public void deleteLast() {
		if (size == 0) {
			System.out.println("List is empty");
			return;
		}

		else if (size == 1) {
			tail = null;
		} else {
			Node trav = tail.next;
			do {
				trav = trav.next;
			} while (trav.next != tail);
			trav.next = tail.next;
			tail = trav;
		}
		size--;
	}

	public void deleteAtPosition(int pos) {
		if (pos < 1 || pos > size) {
			System.out.println("Invalid Position To Delete Data ");
			return;
		}
		if (isEmpty()) {
			System.out.println("list is Empty Cant Delete Element !");
			return;
		} else if (size == 1) {
			tail = null;
		} else if (pos == 1) {
			deleteFirst();
		} else if (pos == size) {
			deleteLast();
		} else {
			Node trav = tail.next;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}

	public void display() {
		if (size == 0) {
			System.out.println("LinkedList is empty");
			return;
		} else {
			Node trav = tail.next;
			System.out.println("List: ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			} while (trav != tail.next);
		}
	}

}
