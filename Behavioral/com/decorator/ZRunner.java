package com.decorator;

public class ZRunner {
	public static void main(String[] args) {
		Beverage expresso = new Expresso();
		System.out.println("Your order: " + expresso.getDescription() + " " + expresso.cost());
		
		Beverage darkRoast = new DarkRoast();
		Beverage darkRoastWithSoy = new WithSoy(darkRoast);
		Beverage darkRoastWithSoyMocha = new WithMocha(darkRoastWithSoy);
		System.out.println("Your order: " + darkRoastWithSoyMocha.getDescription() + " " + darkRoastWithSoyMocha.cost());
	}
}
