package main.java.p1;

import java.util.HashMap;
import java.util.Map;

public class Ingredients {

	IngredientsType ingredientsType;
	double unitcostAditionalIngredient = 0;
	Map<IngredientsType, Double> prices = new HashMap<IngredientsType, Double>();
	
	Ingredients(){
		prices.put(IngredientsType.ASPARAGUS, 10.50);
		prices.put(IngredientsType.ANCHOES, 15.0);
		prices.put(IngredientsType.BROCCOLI, 7.50);
		prices.put(IngredientsType.MOZARELLA_CHEESE, 5.7);
		prices.put(IngredientsType.GREEKCHEESE, 9.0);
	}

	public double getPrice() { 
		return unitcostAditionalIngredient;			
		/*if(prices.containsKey(ingredientsType)) {
			unitcostAditionalIngredient = prices.get(ingredientsType);
			return unitcostAditionalIngredient;
		}
		else {
			//loguear un error
			return 0.0;
		}*/
	}
	
	public void updatePrice(IngredientsType ing, double newPrice) {
		prices.put(ing, newPrice);		
	}

	public IngredientsType getIngredientsType() {
		return ingredientsType;
	}

	public void setIngredientsType(IngredientsType ingredientsType) {
		this.ingredientsType = ingredientsType;
	}

	public void setPrice() {
		// TODO Auto-generated method stub
		if(prices.containsKey(ingredientsType)) {
			unitcostAditionalIngredient = prices.get(ingredientsType);			
		}
	}

}
