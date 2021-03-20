package com.strategy;

/**
 * @author Vishu
 * @category Strategy Pattern Client
 */
public class ZClient {

	public static void main(String[] args) {
		
		/*
		 * ************************************************************************** 
		 * Concept-1										  						*
		 * **************************************************************************
		 * If you just rely on inheriting the Duck class, then for all the Ducks,   *
		 * which do not fly or quack, you need to override the parent Duck class    *
		 * methods to make the child ducks not fly or quack. 		  				*
		 *  												  						*
		 * Principle: Separate the things which will remain constant from the things*
		 *  which tend to change. For this, pull out the fly and quack behavior in  *
		 * the form of interfaces.						                            *     
		 * **************************************************************************
		 * Concept-2                                          						*
		 * **************************************************************************
		 * Now, having these interfaces, it is more worse as if a flying behavior   *
		 * changes, we need to modify it in all the concrete duck classes. Also, it *
		 * is not reusable. Hence, we extract out the behavior and make it reusable *
		 * in other places. For example: If tomorrow, you want to make a horn that  *
		 * quacks, the same set of Quack behavior can be used.    			        *
		 * 													  						*
		 * Principle: Think of reuse. For this, we create two new interfaces,       *
		 * FlyingBehavior and QuackingBehavior and provide implementations of them  *
		 * in sub-classes Further, a duck holds a reference to these interfaces.    *
		 * **************************************************************************
		 * Concept-3										  						*
		 * **************************************************************************
		 * To allow the ducks to decide their implementation of behavior at runtime,*
		 * we must always code to the interfaces and not to the implementations.    *
		 * Here, the meaning of interface is not a Java interface, but rather a     *
		 * superclass. 									                            *
		 * 																		    *
		 * Principle: Code to interface, not to the implementations			        *
		 * **************************************************************************
		 * Strategy Pattern 											            *
		 * **************************************************************************
		 * A set of algorithms with their implementations encapsulated into behavior*
		 * classes, so that, later they could be reused and new algorithms could be *
		 * easily added at any point of time, without changing any part of the code.*
		 * Now, any class that wants to use this newly built algorithm can simply   *
		 * pass it at runtime, because we code to interfaces.         				*
		 * **************************************************************************
		 * Cheers!											  						*
		 * **************************************************************************
		*/
				
		Duck duck = new AfricanDuck();
		duck.setFlyingBehavior(new ShortFly());
		duck.setQuackingBehavior(new QuackToto());
		duck.fly();
		duck.quack();
		duck.display();
		
		Duck duck1 = new RubberDuck();
		duck1.fly();
		duck.quack();
		duck.display();
		duck1.setQuackingBehavior(new QuackDodo());
		duck1.quack();
	}
}
