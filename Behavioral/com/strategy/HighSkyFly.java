package com.strategy;

/**
 * @author Vishu
 * @category Concrete implementation of one type of such behavior
 */
public class HighSkyFly implements FlyingBehavior{
	@Override
	public void fly() {
		System.out.println("I can fly high in the sky");
	}
}
