package com.abcd.test.jpa.model;

import javax.persistence.Entity;

@Entity
public class Phone extends Item {

	private String factory;
	private Float DurationTime;

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public Float getDurationTime() {
		return DurationTime;
	}

	public void setDurationTime(Float durationTime) {
		DurationTime = durationTime;
	}

	// Getters and Setters

}
