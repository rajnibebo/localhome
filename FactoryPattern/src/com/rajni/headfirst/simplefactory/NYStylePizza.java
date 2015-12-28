/**
 * 
 */
package com.rajni.headfirst.simplefactory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:48:03 pm
 */
public class NYStylePizza extends Pizza {
	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public NYStylePizza() {
		// TODO Auto-generated constructor stub
		name = "NYStlePizza";
		dough = "Thin crust dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Ragino Cheese");
	}
}
