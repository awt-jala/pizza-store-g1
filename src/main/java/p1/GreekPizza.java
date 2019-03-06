package main.java.p1;

public class GreekPizza extends Pizza {

	GreekPizza() {
		super(PizzaTypes.GREEK);
		mandatoryIngredients.add(Ingredients.MOZARELLA_CHEESE);
		mandatoryIngredients.add(Ingredients.TOMATO_SAUCE);
		mandatoryIngredients.add(Ingredients.TOMATO_SLICES);
	}

}
