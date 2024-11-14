package com.sam.q1;

public class AddNodeUsingRecursion {
	static class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			data = value;
			left = right = null;
		}
	} // Inner class Node ends here

	private Node root;

	public AddNodeUsingRecursion() {
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

		if(trav == null)
			return;
		
		inOrder(trav.left);
		System.out.print(" " + trav.data);
		inOrder(trav.right);
	}
}
