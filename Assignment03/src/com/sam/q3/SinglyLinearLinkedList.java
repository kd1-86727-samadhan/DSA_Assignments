package com.sam.q3;

public class SinglyLinearLinkedList {
	static class Node {
		int data;
		Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	} // Node inner class ends here

	private Node head;

	public SinglyLinearLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addBefore(int element1, int element2) {
		Node newnode = new Node(element1);
		Node trav = head;

		if (isEmpty()) {
			head = newnode;
		} else if (trav.data == element2) {
			newnode.next = head;
			head = newnode;
		} else {
			while (trav.next.data != element2) {
				trav = trav.next;

				if (trav.next == null) {
					newnode.next = head;
					head = newnode;
					return;
				}
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}

	public void addAfter(int element1, int element2) {
		Node newnode = new Node(element1);
		Node trav = head;

		if (isEmpty()) {
			head = newnode;
		} else {
			while (trav.data != element2) {
				trav = trav.next;
				if (trav.next == null) {
					trav.next = newnode;
					return;
				}
			}
			newnode.next = trav.next;
			trav.next = newnode;
		}
	}

	public void display() {
		Node trav = head;

		System.out.println("List: ");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}

}
