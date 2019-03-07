package main.java.p1;

public class VeggiePizza extends Pizza {
	VeggiePizza() {
		super(PizzaTypes.VEGGIE);
		mandatoryIngredients.add(IngredientsType.MOZARELLA_CHEESE);
		mandatoryIngredients.add(IngredientsType.TOMATO_SAUCE);
		mandatoryIngredients.add(IngredientsType.TOMATO_SLICES);
	}
}
