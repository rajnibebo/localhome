/**
 * 
 */
package com.rajni.headfirst.factory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 9:02:59 pm
 */
abstract class PizzaStore {
	public Pizza orderPizza(Types type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		if(pizza != null) {
			
		}
		return pizza;
	}
	
	abstract Pizza createPizza(Types type);
}
