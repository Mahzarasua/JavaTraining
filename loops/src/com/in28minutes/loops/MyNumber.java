package com.in28minutes.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.setNumber(number);
	}

	public boolean isPrime() {
		// 2 to number-1
		// how can we check if a number is divisibable by 2
		if (number < 2)
			return false;

		for (int i = 2; i <= number - 1; i++)
			if (number % i == 0)
				return false;

		return true;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int sumUptoN() {
		int sum = 0;

		for (int i = 0; i <= number; i++)
			sum = sum + i;

		return sum;
	}

	public int sumOfDivisors() {
		int sumofDivisors = 0;

		if (number < 2)
			return 0;

		for (int i = 2; i <= number - 1; i++)
			if (number % i == 0)
				sumofDivisors = sumofDivisors + i;

		return sumofDivisors;
	}

	public void printNumberTriangle() {
		// 1
		// 1 2
		// 1 2 3
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println("");
		}

	}
}