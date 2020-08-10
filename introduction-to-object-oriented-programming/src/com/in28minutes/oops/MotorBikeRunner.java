package com.in28minutes.oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(10);
		MotorBike honda = new MotorBike(20);
		MotorBike somethingElse = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(50);
		honda.setSpeed(-1);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(somethingElse.getSpeed());
	}
}
