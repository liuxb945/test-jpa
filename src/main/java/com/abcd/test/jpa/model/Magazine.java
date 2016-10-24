package com.abcd.test.jpa.model;

import javax.persistence.Entity;

@Entity
public class Magazine extends Item {

	private String isbn;
	private String publisher;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	// Getters and Setters

}
