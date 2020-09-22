package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		numbers.stream().forEach(element -> System.out.println(element));

		int sumFP = fpSum(numbers);

		System.out.println("SumFP: " + sumFP);

		int sum = normalSum(numbers);

		System.out.println("NormalSum: " + sum);

		// Exercise 1, print square of first 10 numbers
		IntStream.range(1, 10).map(e -> e * e).forEach(e -> System.out.println("Square: " + e));

		// Exercise 2, convert to lower case
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.toLowerCase()).forEach(e -> System.out.println(e));

		// Exercise 3, print the lentgh
		List.of("Apple", "Ant", "Bat").stream().map(e -> e.length()).forEach(e -> System.out.println(e));
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers)
			sum += number;
		return sum;
	}

}
