/**
 * 
 */
package com.rajni.headfirst.abstractfactory;

/**
 * @author Rajni
 *
 * @date 26-Dec-2015 12:24:51 am
 */
public class NyPizzaStore {
	
	IngredientFactory factory;
	
	/**
	 * 
	 */
	public NyPizzaStore() {
		// TODO Auto-generated constructor stub
		factory = new NyStyleIngredientFactory();
	}
	
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		if(item.equals("cheese")) {
			pizza = new CheesePizza(factory);
		}
		return pizza;
	}
}
