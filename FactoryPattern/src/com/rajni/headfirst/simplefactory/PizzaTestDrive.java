/**
 * 
 */
package com.rajni.headfirst.simplefactory;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:58:59 pm
 */
public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore store = new NyPizzaStore();
		store.orderPizza("cheese");
		
		store = new ChicagoPizzaStore();
		store.orderPizza("cheese");
	}
}
