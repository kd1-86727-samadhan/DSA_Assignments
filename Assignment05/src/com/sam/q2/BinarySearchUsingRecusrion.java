package com.sam.q2;

public class BinarySearchUsingRecusrion {
	static class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	} // Inner class Node ends here

	private Node root;

	public BinarySearchUsingRecusrion() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int data) {
		root = addNode(root, data);
	}

	private Node addNode(Node trav, int value) {
		if (trav == null)
			return new Node(value);

		if (value < trav.data) {
			// Recursive call
			trav.left = addNode(trav.left, value);
		} else if (value > trav.data) {
			// Recursive call
			trav.right = addNode(trav.right, value);
		}
		return trav;
	}

	public void inOrder() {
		System.out.print("Inorder: ");
		inOrder(root);
	}

	private void inOrder(Node trav) {

		if (trav == null)
			return;

		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
	}

	public Node searchingNode(int key) {

		return searchingNode(root, key);
	}

	public Node searchingNode(Node trav, int key) {
		if (trav == null)
			return null;

		if (key == trav.data)
			return trav;

		if (key < trav.data)
			return searchingNode(trav.left, key); // Recursive call
		else
			return searchingNode(trav.right, key); // Recursive call
	}
}
