package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.setName(name);
		for (int mark : marks)
			this.marks.add(mark);
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks)
			sum = sum + mark;
		return sum;
	}

	public int getMaximumMark() {
//		int max = Integer.MIN_VALUE;
//		for (int mark : marks)
//			if (mark > max)
//				max = mark;
		return Collections.max(marks);
	}

	public int getMinimumMark() {
//		int min = Integer.MAX_VALUE;
//		for (int mark : marks)
//			if (mark <= min)
//				min = mark;
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		BigDecimal average = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()), 3,
				RoundingMode.UP);
		return average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + marks;
	}

}
