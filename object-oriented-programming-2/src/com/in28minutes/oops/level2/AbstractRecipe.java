package com.in28minutes.oops.level2;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}

	// prepare
	abstract void getReady();

	// recipe
	abstract void doTheDish();

	// cleanup
	abstract void cleanUp();
}
