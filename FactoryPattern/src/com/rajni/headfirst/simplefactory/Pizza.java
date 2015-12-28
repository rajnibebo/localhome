/**
 * 
 */
package com.rajni.headfirst.simplefactory;

import java.util.ArrayList;

/**
 * @author Rajni
 *
 * @date 25-Dec-2015 3:37:46 pm
 */
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	@SuppressWarnings("rawtypes")
	ArrayList toppings = new ArrayList();
	public void prepare(){
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough");
		System.out.println("Adding Toppings : ");
		for(int i = 0 ; i < toppings.size(); i++) {
			System.out.println(toppings.get(i)+" ");
		}
	}
	
	public void bake(){
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
}
