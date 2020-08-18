package com.in28minutes.oops.level2;

public class Rectangle {
	//Stage
	private int length;
	private int width;
	
	//creation
	public Rectangle(int length, int width) {
		this.setLength(length);
		this.setWidth(width);
	}
	
	//operations
	public int area() {
		return getLength()*getWidth();
	}
	
	public int perimeter() {
		return 2*(getLength() + getWidth());
	}
	
	public String toString() {
		return String.format("Length - %d, Width - %d, area - %d, perimeter - %d", getLength(), getWidth(),  area(), perimeter());
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
