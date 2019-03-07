package main.java.p1;

import java.util.HashSet;

/**
 * This is a concrete class of superClass Pizza.
 * @author CarlosRichter.
 * @version 1.0.
 */
public class CheesePizza extends Pizza {
	//public double totalCost;
	public final double PIZZA_COST_WI =10;
	public CheesePizza() {
		super(PizzaTypes.CHEESE);
		/**
		 * This is a constructor of the CheesePizza class.
		 * below we can find the price of a pizza without extra ingredients.
		 */
		PIZZA_COST = PIZZA_COST_WI;

	}

	public double totalCost(HashSet<Ingredients> list) {
		double sum = 0;
		for (Ingredients ing : list) {
			sum = sum + ing.getPrice();
		}

		return PIZZA_COST + sum;
	}

}
