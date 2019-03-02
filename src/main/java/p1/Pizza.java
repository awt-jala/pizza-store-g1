package main.java.p1;

import java.util.ArrayList;

public abstract class Pizza {
	private PizzaTypes pizzaType;
	ArrayList<String> mandatoryIngredients;
	ArrayList<String> optionalIngredients;

	Pizza(PizzaTypes pizzaType) {
		mandatoryIngredients = new ArrayList<String>();
		mandatoryIngredients.add("Chesse");
		optionalIngredients = new ArrayList<String>();
		optionalIngredients.add("tomato");
		optionalIngredients.add("Champignone");
		optionalIngredients.add("jamon");

		this.pizzaType = pizzaType;
	}

	public void showIngredients() {
		System.out.println(mandatoryIngredients);
		System.out.println(optionalIngredients);

	}

	public void removeIngrediente(String ingredient) {

		optionalIngredients.remove(ingredient);

	}

	public void aditionIngrediente(String ingredient) {

		optionalIngredients.add(ingredient);

	}

	
	
	public String PrintType2() {
		String type = "PIZZA " + pizzaType;
		return type;
	}

}
