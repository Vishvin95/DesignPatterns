package com.decorator;

public class WithSoy extends CoffeeDecorator {
	private Beverage beverage;
	
	public WithSoy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	protected String getDescription() {
		return beverage.getDescription() + " with soy";
	}
	
	@Override
	public int cost() {
		return 5 + beverage.cost();
	}

}
