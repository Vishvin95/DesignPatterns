package com.strategy;

/**
 * @author Vishu
 * @category Concrete class representing a parent object
 */
public class Duck {
	protected FlyingBehavior flyingBehavior;
	protected QuackingBehavior quackingBehavior;
	
	void fly(){
		flyingBehavior.fly();
	}
	
	void quack() {
		quackingBehavior.quack();
	}
	
	void display() {
		System.out.println("Displaying a duck");
	}

	public FlyingBehavior getFlyingBehavior() {
		return flyingBehavior;
	}

	public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
		this.flyingBehavior = flyingBehavior;
	}

	public QuackingBehavior getQuackingBehavior() {
		return quackingBehavior;
	}

	public void setQuackingBehavior(QuackingBehavior quackingBehavior) {
		this.quackingBehavior = quackingBehavior;
	}
}
