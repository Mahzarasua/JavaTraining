package com.in28minutes.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(6);
		System.out.println("Number: " + number.getNumber());

		boolean isPrime = number.isPrime();
		System.out.println("isPrime: " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("Sum: " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("Sum of Divisors: " + sumOfDivisors);

		number.printNumberTriangle();
	}

}
