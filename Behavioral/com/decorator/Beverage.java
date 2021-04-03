package com.decorator;

public abstract class Beverage {
	private String description;

	protected String getDescription() {
		return description;
	}

	abstract public int cost();
}
