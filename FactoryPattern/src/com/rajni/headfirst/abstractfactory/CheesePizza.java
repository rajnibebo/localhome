/**
 * 
 */
package com.rajni.headfirst.abstractfactory;

/**
 * @author Rajni
 *
 * @date 26-Dec-2015 12:32:25 am
 */
public class CheesePizza extends Pizza{
	IngredientFactory pizzaFac;
	
	/**
	 * 
	 */
	public CheesePizza(IngredientFactory pizzaFac) {
		// TODO Auto-generated constructor stub
		this.pizzaFac = pizzaFac;
	}

	/* (non-Javadoc)
	 * @see com.rajni.headfirst.abstractfactory.Pizza#prepare()
	 */
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing "+name);
		dough = pizzaFac.createDough();
		// similarly other methods as well
	}
	
	
}
