package com.in28minutes.loops;

public class WhileNumberPlayer {

	private int limit = 0;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	// For limit = 30, output would be 1 4 9 16 25
	public void printSquaresUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			System.out.println(i * i);
			i++;
		}
	}

	// For limit = 30, output wold be 1 8 27
	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < limit) {
			System.out.println(i * i * i);
			i++;
		}
	}

}
