package com.in28minutes.firstjavaproject;

import java.math.BigDecimal;

class TestBean {
	private int i;
	private String str;

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}

	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}

	public TestBean(int i, String str) {
		super();
		this.i = i;
		this.str = str;
	}

	public TestBean() {
		super();
		// TODO Auto-generated constructor stub
	}

}

class Test implements Comparable<String> {

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class EclipseTipsAndTricks {

	public static void main(String[] args) throws InterruptedException {

		DummyForTest dt = new DummyForTest();
		dt.doSomething();

		BigDecimal bd = new BigDecimal(25);
		Thread.sleep(1000);
	}

}
