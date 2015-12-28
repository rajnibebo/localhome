/**
 * 
 */
package com.rajni.headfirst.factory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 9:12:03 pm
 */
class ChicagoPizzaStore extends PizzaStore {

	/* (non-Javadoc)
	 * @see com.rajni.headfirst.factory.PizzaStore#createPizza(com.rajni.headfirst.factory.Types)
	 */
	@Override
	Pizza createPizza(Types type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(type == Types.CHEESE) {
			pizza = new ChicagoStyleCheesePizza();
		}
		return pizza;
	}

}
