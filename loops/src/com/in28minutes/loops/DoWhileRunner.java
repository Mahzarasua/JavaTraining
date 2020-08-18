package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
//		DoWhile dw = new DoWhile();

		int number = 0;
		Scanner scanner = new Scanner(System.in);

		do {
			if (number != 0)
				System.out.println("Cube is: " + number * number * number);
			System.out.println("Enter a number: ");
			number = scanner.nextInt();
		} while (number > 0);
		System.out.println("Thank you! Have fun");
	}

}
