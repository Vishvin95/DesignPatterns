package com.strategy;

/**
 * @author Vishu
 * @category Concrete implementation of one type of such behavior
 */
public class ShortFly implements FlyingBehavior{
	@Override
	public void fly() {
		System.out.println("I can do a short fly");
	}
}
