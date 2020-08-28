package com.in28minutes.oops.level2;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw materials");
		System.out.println("Get utensils");

	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the Dish");
	}

	@Override
	void cleanUp() {
		// TODO Auto-generated method stub
		System.out.println("clean utensils");
	}

}
