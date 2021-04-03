package com.decorator;

public class Decaf extends Beverage {
	public Decaf() {

	}

	@Override
	protected String getDescription() {
		return "Decaf";
	}

	@Override
	public int cost() {
		return 20;
	}
}
