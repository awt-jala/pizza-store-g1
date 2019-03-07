package main.java.p1;

/**
 * This is a concrete class of superClass Pizza
 * 
 * @author CarlosRichter
 * @version 1.0
 */
public class CheesePizza extends Pizza {

	public CheesePizza() {
		/**
		 * Here is a constructor class Pizza
		 */
		super(PizzaTypes.CHEESE);
		mandatoryIngredients.add(IngredientsType.MOZARELLA_CHEESE);
		mandatoryIngredients.add(IngredientsType.TOMATO_SAUCE);
		mandatoryIngredients.add(IngredientsType.TOMATO_SLICES);

	}

}
