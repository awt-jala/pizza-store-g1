package main.java.p1;

public class Mani {

	public static void main(String[] args) {
		final FactoryBranchA factoryA = new FactoryBranchA();	
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Ingredients anchoeIngredient = new Ingredients(
                IngredientType.ANCHOES); 
		pizzaA.aditionIngrediente(anchoeIngredient);
		//pizzaA.aditionIngrediente(anchoeIngredient);
		final Ingredients tomatoSauceIngredient = new Ingredients(
                IngredientType.PLUM_TOMATO_SAUCE); 
		pizzaA.showIngredients();
		//pizzaA.removeIngrediente(anchoeIngredient);
		//pizzaA.showIngredients();
		
		System.out.println(pizzaA.getTotalCostIngredientsList());
	}

}
