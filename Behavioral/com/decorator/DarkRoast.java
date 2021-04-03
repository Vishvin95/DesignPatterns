package com.decorator;

public class DarkRoast extends Beverage {
	public DarkRoast() {

	}

	@Override
	protected String getDescription() {
		return "Dark Roast";
	}
	
	@Override
	public int cost() {
		return 30;
	}

}
