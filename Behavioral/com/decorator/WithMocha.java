package com.decorator;

public class WithMocha extends CoffeeDecorator {
	private Beverage beverage;

	public WithMocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	protected String getDescription() {
		return beverage.getDescription() + " with mocha";
	}
	
	@Override
	public int cost() {
		return 7 + beverage.cost();
	}

}
