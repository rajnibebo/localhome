/**
 * 
 */
package com.rajni.headfirst.simplefactory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:57:29 pm
 */
public class ChicagoPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see com.rajni.headfirst.PizzaStore#createPizza(java.lang.String)
	 */
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		return pizza;
	}

}
