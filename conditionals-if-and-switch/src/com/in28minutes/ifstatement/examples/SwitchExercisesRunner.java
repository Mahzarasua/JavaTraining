package com.in28minutes.ifstatement.examples;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
//		SwitchExercise switchExcercise = new SwitchExercise();

		boolean bo = SwitchExercises.isWeekDay(1);
		System.out.println("is a WeekDay?: " + bo);

		String month = SwitchExercises.determineNameOfTheMonth(1);
		System.out.println("The Month is: " + month);

		String nameOfTheDay = SwitchExercises.determineNameOfTheDay(0);
		System.out.println("The Day is: " + nameOfTheDay);
	}

}
