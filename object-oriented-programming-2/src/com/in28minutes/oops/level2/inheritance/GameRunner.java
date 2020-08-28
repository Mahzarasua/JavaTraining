package com.in28minutes.oops.level2.inheritance;

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
		ChessGame game = new ChessGame();

		game.up();
		game.down();
		game.left();
		game.right();

	}

}
