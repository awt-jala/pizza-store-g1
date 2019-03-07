package main.java.p1;

import java.util.HashSet;

public abstract class Pizza {
	private PizzaTypes pizzaType;
	double PIZZA_COST;

	//HashSet<Ingredients> mandatoryIngredients;
	HashSet<Ingredients> optionalIngredients;

	Pizza(PizzaTypes pizzaType) {
		this.pizzaType = pizzaType;
		optionalIngredients = new HashSet<Ingredients>();
		/*
		 * optionalIngredients.add(IngredientsType.ANCHOES);
		 * optionalIngredients.add(IngredientsType.OLIVE);
		 * optionalIngredients.add(IngredientsType.PINEAPPLE);
		 * optionalIngredients.add(IngredientsType.SPICY_SAUCE);
		 * optionalIngredients.add(IngredientsType.SALAME);
		 */
		//mandatoryIngredients = new HashSet<Ingredients>();
	}

	public void showIngredients() {
		//System.out.println(mandatoryIngredients);
		System.out.println(optionalIngredients);
	}

	public void removeIngrediente(Ingredients ingredient) {
		optionalIngredients.remove(ingredient);
	}

	public void aditionIngrediente(Ingredients ingredient) {
		optionalIngredients.add(ingredient);
	}

	public String PrintType2() {
		String type = "PIZZA " + pizzaType;
		return type;
	}

	public double getPizzaCost() {
		return PIZZA_COST;
	}

	public void setPizzaCost(double pizzaCost) {
		this.PIZZA_COST = pizzaCost;
	}
	
	public double totalCost(HashSet<Ingredients> list) {
		double sum = 0;
		for (Ingredients ing : list) {
			sum = sum + ing.getCostAditionalIngredient(ing.ingredientsType);
		}

		return PIZZA_COST + sum;
	}
	
}
