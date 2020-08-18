package com.in28minutes.oops.level2;

public class Review {

	private int id;
	private String review;
	private int rating;

	public Review(int id, String review, int value) {
		this.setId(id);
		this.setReview(review);
		this.setValue(value);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getValue() {
		return rating;
	}

	public void setValue(int value) {
		this.rating = value;
	}

	@Override
	public String toString() {
		return String.format("Review: %d, %s, %s", id, review, rating);
	}
}
