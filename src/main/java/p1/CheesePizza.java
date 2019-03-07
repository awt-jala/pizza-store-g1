package main.java.p1;

import java.util.HashSet;

/**
 * This is a concrete class of superClass Pizza.
 * 
 * @author CarlosRichter.
 * @version 1.0.
 */
public class CheesePizza extends Pizza {
	//public double totalCost;

	public CheesePizza() {
		super(PizzaTypes.CHEESE);
		PIZZA_COST = 10;

	}

	public double totalCost(HashSet<Ingredients> list) {
		double sum = 0;
		for (Ingredients ing : list) {
			sum = sum + ing.getPrice();
		}

		return PIZZA_COST + sum;
	}

}
