package main.java.p1;

import java.util.HashMap;
import java.util.Map;

public class Ingredients {

	IngredientType ingredientsType;
	double unitcostAditionalIngredient = 0;
	Map<IngredientType, Double> prices = new HashMap<IngredientType, Double>();
	
	Ingredients(){
		prices.put(IngredientType.ASPARAGUS, 10.50);
		prices.put(IngredientType.ANCHOES, 15.0);
		prices.put(IngredientType.BROCCOLI, 7.50);
		prices.put(IngredientType.MOZARELLA_CHEESE, 5.7);
		
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
	
	public void updatePrice(IngredientType ing, double newPrice) {
		prices.put(ing, newPrice);		
	}

	public IngredientType getIngredientsType() {
		return ingredientsType;
	}

	public void setIngredientsType(IngredientType ingredientsType) {
		this.ingredientsType = ingredientsType;
	}

	public void setPrice() {
		// TODO Auto-generated method stub
		if(prices.containsKey(ingredientsType)) {
			unitcostAditionalIngredient = prices.get(ingredientsType);			
		}
	}

}
