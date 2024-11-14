package com.sam.q1;

public class MainApp {
	public static void main(String[] args) {
		AddNodeUsingRecursion bst = new AddNodeUsingRecursion();

		bst.addNode(4);
		bst.addNode(2);
		bst.addNode(45);
		bst.addNode(3);
		bst.addNode(51);
		bst.addNode(76);
		bst.addNode(24);
		bst.addNode(9);
		bst.addNode(7);
		bst.addNode(28);
		
		bst.inOrder();

	}
}
