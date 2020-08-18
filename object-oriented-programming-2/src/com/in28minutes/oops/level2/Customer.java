package com.in28minutes.oops.level2;

public class Customer {
	// State
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// creation
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.setHomeAddress(homeAddress);
	}

	// Operations
	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
//		return String.format("Name - %s, homeAdress: - %s, %s, %s, workAdress: - %s, %s, %s", name,
//				homeAddress.getLine1(), homeAddress.getCity(), homeAddress.getZip(), workAddress.getLine1(),
//				workAddress.getCity(), workAddress.getZip());
		return String.format("Name - %s, homeAdress: - %s, %s, %s", name, homeAddress.getLine1(), homeAddress.getCity(),
				homeAddress.getZip());
	}
}
