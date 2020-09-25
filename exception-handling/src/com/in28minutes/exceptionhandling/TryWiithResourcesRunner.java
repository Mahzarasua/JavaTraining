package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWiithResourcesRunner {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int[] numbers = { 1, 2, 3, 4, 5 };

			int number = numbers[5];

		}

		System.out.println("just before closing out main");
	}

}
