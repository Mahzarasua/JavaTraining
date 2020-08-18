package com.in28minutes.oops.level2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("make", 2.5, "black");
		fan.switchOn();
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
	}

}
