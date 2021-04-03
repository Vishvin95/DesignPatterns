package com.decorator;

public class HouseBlend extends Beverage {
	public HouseBlend() {

	}

	@Override
	protected String getDescription() {
		return "House Blend";
	}

	@Override
	public int cost() {
		return 40;
	}

}
