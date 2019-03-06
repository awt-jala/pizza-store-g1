package main.java.p1;

public class VeggiePizza extends Pizza {
	VeggiePizza() {
		super(PizzaTypes.VEGGIE);
		mandatoryIngredients.add(Ingredients.MOZARELLA_CHEESE);
		mandatoryIngredients.add(Ingredients.TOMATO_SAUCE);
		mandatoryIngredients.add(Ingredients.TOMATO_SLICES);
	}
}
