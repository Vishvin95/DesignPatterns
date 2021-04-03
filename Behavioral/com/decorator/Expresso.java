package com.decorator;

public class Expresso extends Beverage {

	public Expresso() {

	}

	@Override
	protected String getDescription() {
		return "Expresso";
	}

	@Override
	public int cost() {
		return 10;
	}
}
