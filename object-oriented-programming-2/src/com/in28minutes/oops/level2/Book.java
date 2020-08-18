package com.in28minutes.oops.level2;

import java.util.ArrayList;

public class Book {

	private int id;
	private String bookName;
	private String bookAuthor;
	private ArrayList<Review> review = new ArrayList<Review>();

	public Book(int id, String bookName, String bookAuthor) {
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	@Override
	public String toString() {
		return String.format("Book: %d, %s, %s Reviews: ", id, bookName, bookAuthor) + review;
	}

}
