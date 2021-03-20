package com.strategy;

/**
 * @author Vishu
 * @category Concrete implementation of one type of such behavior
 */
public class QuackDodo implements QuackingBehavior {
	@Override
	public void quack() {
		System.out.println("I make a dodo sound when quacking");
	}
}
