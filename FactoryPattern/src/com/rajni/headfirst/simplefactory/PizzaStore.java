/**
 * 
 */
package com.rajni.headfirst.simplefactory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:37:10 pm
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		if(pizza != null) {
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}
		return pizza;
	}
	abstract protected Pizza createPizza(String type);
}
