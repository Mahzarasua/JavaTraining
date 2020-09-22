package com.in28minutes.functionalprogramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class FilterMethod implements Predicate<Integer> {

	@Override
	public boolean test(Integer number) {
		return number % 2 == 0;
	}

}

class MaxMethod implements Comparator<Integer> {

	@Override
	public int compare(Integer n1, Integer n2) {
		return Integer.compare(n1, n2);
	}

}

public class MethodReferencesRunner {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(MethodReferencesRunner::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(createEvenPredicate())
				.max((n1, n2) -> Integer.compare(n1, n2)).orElse(0);
		System.out.println(max);

		Integer max2 = List.of(23, 45, 67, 34).stream().filter(new FilterMethod()).max(new MaxMethod()).orElse(0);
		System.out.println(max2);

		Integer max3 = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare)
				.orElse(0);
		System.out.println(max3);

		// 1. Storing fucntions in variables
		// 2. Passing functions to methods
		// 3. Returning functions from methods
		Predicate<? super Integer> evenPredicate = createEvenPredicate();
		Integer max4 = List.of(23, 45, 67, 34).stream().filter(evenPredicate).max((n1, n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println(max4);

	}

	private static Predicate<? super Integer> createEvenPredicate() {
		return n -> n % 2 == 0;
	}

}
