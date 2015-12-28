/**
 * 
 */
package com.rajni.headfirst.factory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 9:09:17 pm
 */
public class NyPizzaStore extends PizzaStore{

	/* (non-Javadoc)
	 * @see com.rajni.headfirst.factory.PizzaStore#createPizza(com.rajni.headfirst.factory.Types)
	 */
	@Override
	Pizza createPizza(Types type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type == Types.CHEESE) {
			pizza = new NyStyleCheesePizza();
		}
		return pizza;
	}

}
