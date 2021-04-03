package com.decorator;

public class WithWhip extends CoffeeDecorator {
	private Beverage beverage;

	public WithWhip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	protected String getDescription() {
		return beverage.getDescription() + " with whip";
	}

	@Override
	public int cost() {
		return 9 + beverage.cost();
	}

}
