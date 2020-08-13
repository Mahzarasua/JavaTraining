package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}

	MotorBike() {
		this(5);
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	// behavior
	void start() {
		System.out.println("Bike started");
	}
}
