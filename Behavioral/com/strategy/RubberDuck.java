package com.strategy;

/**
 * @author Vishu
 * @category Concrete class representing a child object
 */
public class RubberDuck extends Duck{	
	
	public RubberDuck() {
		super.flyingBehavior = new NoFly();
		super.quackingBehavior = new QuackDodo();
	}
	
	@Override
	void display() {		
		super.display();
		System.out.println("Modifying the display of rubber duck on screen");
	}
}
