package main.java.p1;

import java.util.HashSet;

public abstract class Pizza {
	private PizzaTypes pizzaType;
	
	HashSet<IngredientsType> mandatoryIngredients;
	HashSet<IngredientsType> optionalIngredients;

	Pizza(PizzaTypes pizzaType) {
		this.pizzaType = pizzaType;
		optionalIngredients = new HashSet<IngredientsType>();
		optionalIngredients.add(IngredientsType.ANCHOES);
		optionalIngredients.add(IngredientsType.OLIVE);
		optionalIngredients.add(IngredientsType.PINEAPPLE);
		optionalIngredients.add(IngredientsType.SPICY_SAUCE);
		optionalIngredients.add(IngredientsType.SALAME);

		mandatoryIngredients = new HashSet<IngredientsType>();
	}

	public void showIngredients() {
		System.out.println(mandatoryIngredients);
		System.out.println(optionalIngredients);
	}

	public void removeIngrediente(IngredientsType ingredient) {
		optionalIngredients.remove(ingredient);
	}

	public void aditionIngrediente(IngredientsType ingredient) {
		optionalIngredients.add(ingredient);
	}

	public String PrintType2() {
		String type = "PIZZA " + pizzaType;
		return type;
	}

}
