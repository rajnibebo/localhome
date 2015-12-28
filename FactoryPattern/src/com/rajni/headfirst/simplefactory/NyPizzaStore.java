/**
 * 
 */
package com.rajni.headfirst.simplefactory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:54:30 pm
 */
public class NyPizzaStore extends PizzaStore{

	/* (non-Javadoc)
	 * @see com.rajni.headfirst.PizzaStore#createPizza()
	 */
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type.equals("cheese")) {
			pizza = new NYStylePizza();
		}
		return pizza;
	}
	
}
