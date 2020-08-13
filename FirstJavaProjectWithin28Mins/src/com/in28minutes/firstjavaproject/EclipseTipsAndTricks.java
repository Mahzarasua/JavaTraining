package com.in28minutes.firstjavaproject;

import java.math.BigDecimal;

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
