package com.sam.q2;

public class MainApp {

	public static void main(String[] args) {
		BinarySearchUsingRecusrion bst = new BinarySearchUsingRecusrion();

		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(9);

		bst.inOrder();
		
		System.out.println();
		
		BinarySearchUsingRecusrion.Node key = bst.searchingNode(9);
		if (key == null)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found");
	}

}
