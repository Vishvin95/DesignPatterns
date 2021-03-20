package com.strategy;

/**
 * @author Vishu
 * @category Concrete implementation of one type of such behavior, for handling NoFly case
 */
public class NoFly implements FlyingBehavior {

	@Override
	public void fly() {
		System.out.println("I can't fly");
	}

}
