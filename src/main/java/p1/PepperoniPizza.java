package main.java.p1;

import java.util.ArrayList;

public class PepperoniPizza extends Pizza {
	PepperoniPizza() {
		super(PizzaTypes.PEPPERONI);
		mandatoryIngredients.add(IngredientsType.MOZARELLA_CHEESE);
		mandatoryIngredients.add(IngredientsType.TOMATO_SAUCE);
		mandatoryIngredients.add(IngredientsType.TOMATO_SLICES);
	}

}
