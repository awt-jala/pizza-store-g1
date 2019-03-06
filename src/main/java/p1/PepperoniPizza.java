package main.java.p1;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza {
	PepperoniPizza() {
		super(PizzaTypes.PEPPERONI);
		mandatoryIngredients.add(Ingredients.MOZARELLA_CHEESE);
		mandatoryIngredients.add(Ingredients.TOMATO_SAUCE);
		mandatoryIngredients.add(Ingredients.TOMATO_SLICES);
	}

}
