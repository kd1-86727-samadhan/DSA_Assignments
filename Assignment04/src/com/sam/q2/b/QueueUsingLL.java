package com.sam.q2.b;

public class QueueUsingLL {

	static class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	} // Node

	private Node front, rear;

	public QueueUsingLL() {
		front = rear = null;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public void push(int value) {
		// 1. Create new node first
		Node newnode = new Node(value);

		if (rear == null) {
			rear = front = newnode;
			return;
		} else {
			rear.next = newnode;
			rear = newnode;
		}
	}

	public int pop() {
		int temp = front.data;
		front = front.next;

		if (front == null) {
			rear = null;
		}
		return temp;
	}
	
	public int peek()
	{
		return front.data;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
			return;
		}
		else
		{
			Node trav = front;
			System.out.println("Queue: ");
			while(trav!=null)
			{
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
		}
	}
}
