/**
 * 
 */
package com.rajni.headfirst.abstractfactory;

/**
 * @author Rajni
 *
 * @date 26-Dec-2015 12:27:11 am
 */
public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Pepperoni pepperoni;
	Clam clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Baking ");
	}
	
	void cut() {
		System.out.println("Cutting");
	}
	
	void box() {
		System.out.println("Box out");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Pizza ready : "+name;
	}
	
	
}
