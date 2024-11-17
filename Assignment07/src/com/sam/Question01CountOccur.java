package com.sam;

public class Question01CountOccur {

	public static void main(String[] args) {
		String name = "India is my counrty";

		String[] words = name.split(" ");
		countOccurrenceOfword(words);
	}

	private static void countOccurrenceOfword(String[] word) {
		boolean[] visited = new boolean[word.length];

		System.out.println("Word occurrence");

		for (int i = 0; i < word.length; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 0;
			for (int j = 0; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println("Count of " + word[i] + " : " + count);
		}
	}
}
