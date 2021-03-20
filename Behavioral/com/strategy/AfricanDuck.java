package com.strategy;

/**
 * @author Vishu
 * @category Concrete class representing a child object
 */
public class AfricanDuck extends Duck{
	
	public AfricanDuck() {
		
	}
	
	@Override
	void display() {		
		super.display();
		System.out.println("African duck display modified");
	}
}
