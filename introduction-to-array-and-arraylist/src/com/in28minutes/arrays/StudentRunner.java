package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Mike", 95, 98, 81);
		System.out.println("Name: " + student.getName());

		int number = student.getNumberOfMarks();
		System.out.println("Number of Marks: " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks: " + sum);

		int maxMark = student.getMaximumMark();
		System.out.println("Maximum mark: " + maxMark);

		int minMark = student.getMinimumMark();
		System.out.println("Minimum mark: " + minMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("Average of Marks: " + average);

		System.out.println(student);

//		student.addNewMark(35);

//		student.removeMarkAtIndex(3);
	}

}
