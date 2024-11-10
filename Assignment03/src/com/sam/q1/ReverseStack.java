package com.sam.q1;

import java.util.Arrays;

public class ReverseStack {
	int rarr[];
	private final int SIZE;
	int top;

	public ReverseStack(int size) {
		SIZE = size;
		rarr = new int[SIZE];
		top = -1;
	}

	public void pushReverse(int value) {
		rarr[++top] = value;
	}

	public void displayReverse() {
		System.out.println("Reverse array: " + Arrays.toString(rarr));
	}

}
