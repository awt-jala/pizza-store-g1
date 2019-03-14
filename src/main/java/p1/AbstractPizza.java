package main.java.p1;

import java.util.HashSet;

public abstract class AbstractPizza extends Product {
	private final PizzaTypes pizzaType;
	double pizzaCost;

	HashSet<Ingredients> ingredientsList = new HashSet<Ingredients>();

	AbstractPizza(final PizzaTypes pizzaType) {
		this.pizzaType = pizzaType;

		// this.ingredientsList = new HashSet<Ingredients>();

	}

	public HashSet<Ingredients> getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(final HashSet<Ingredients> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}

	public void showIngredients() {
		for (final Ingredients ing : ingredientsList)
			// System.out.println(mandatoryIngredients);
			System.out.println(ing.getIngredientsType());
	}

	public final void removeIngrediente(final Ingredients ingredient) { //
		ingredientsList.remove(ingredient);

	}

	public final void removeIngrediente(IngredientType type) {
		for (final Ingredients ing : ingredientsList) {
			if (ing.getIngredientsType() == type) {
				ingredientsList.remove(ing);
			} //
				// ingredientsList.remove(ingredient);
		}
	}

	public final void aditionIngrediente(final Ingredients ingredient) {
		ingredientsList.add(ingredient);
	}

	/*public final void aditionIngrediente(final IngredientType type) {
		for (final Ingredients ing : ingredientsList) {
			if (ing.getIngredientsType() != type) {
				ingredientsList.add(new Ingredients(type));
			}
		}
	}*/

	@Override
	public String printType() {
		final String type = "PIZZA " + pizzaType;
		return type;
	}

	public double getPizzaCost() {
		return pizzaCost;
	}

	public void setPizzaCost(final double pizzaCost) {
		this.pizzaCost = pizzaCost;
	}

	public double totalCost(final HashSet<Ingredients> list) {
		double sum = 0;
		for (final Ingredients ing : list) {
			sum = sum + ing.getPrice();
		}

		return pizzaCost + sum;
	}

	@Override
	public double getTotalCostIngredientsList() {

		double sum = 0;
		for (final Ingredients ing : ingredientsList) {
			sum = sum + ing.getPrice();
		}

		return pizzaCost + sum;
	}
}
