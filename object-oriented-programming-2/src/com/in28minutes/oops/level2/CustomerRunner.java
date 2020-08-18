package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Customer customer = new Customer("Mike", new Address("Line1", "City", "Zip"));
		System.out.println(customer);
	}

}
