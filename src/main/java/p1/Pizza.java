package main.java.p1;

import java.util.HashSet;

public abstract class Pizza {
	private PizzaTypes pizzaType;
	
	HashSet<Ingredients> mandatoryIngredients;
	HashSet<Ingredients> optionalIngredients;

	Pizza(PizzaTypes pizzaType) {
		this.pizzaType = pizzaType;
		optionalIngredients = new HashSet<Ingredients>();
		optionalIngredients.add(Ingredients.ANCHOES);
		optionalIngredients.add(Ingredients.OLIVE);
		optionalIngredients.add(Ingredients.PINEAPPLE);
		optionalIngredients.add(Ingredients.SPICY_SAUCE);
		optionalIngredients.add(Ingredients.SALAME);

		mandatoryIngredients = new HashSet<Ingredients>();
	}

	public void showIngredients() {
		System.out.println(mandatoryIngredients);
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

}
