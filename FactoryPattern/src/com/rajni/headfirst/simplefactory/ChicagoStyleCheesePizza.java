/**
 * 
 */
package com.rajni.headfirst.simplefactory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:49:52 pm
 */
public class ChicagoStyleCheesePizza extends Pizza {
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		toppings.add("Shredded Mozrella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
