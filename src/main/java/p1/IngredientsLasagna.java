package main.java.p1;

import java.util.HashMap;
import java.util.Map;

public class IngredientsLasagna {
    IngredientType ingredientsType;
    double unitcostIngredient = 0;
    Map<IngredientType, Double> prices = new HashMap<IngredientType, Double>();

    public IngredientsLasagna() {
        prices.put(IngredientType.LASAGNA_NOODLES, 7.00);
        prices.put(IngredientType.MEAT, 20.0);
        prices.put(IngredientType.PLUM_TOMATO_SAUCE, 7.50);
        prices.put(IngredientType.MARINARA_SAUCE, 5.5);
        prices.put(IngredientType.GARLIC, 1.00);
        prices.put(IngredientType.OREGANO, 1.00);
        prices.put(IngredientType.MOZARELLA_CHEESE, 15.00);
        prices.put(IngredientType.PARMESAN_CHEESE, 5.00);
        // TODO Auto-generated constructor stub
    }

    public IngredientType getIngredientsType() {
        return ingredientsType;
    }

    public void setIngredientsType(final IngredientType ingredientsType) {
        this.ingredientsType = ingredientsType;
    }

    public double getPrice() {
        return unitcostIngredient;
    }

    public void updatePrice(final IngredientType ing, final double newPrice) {
        prices.put(ing, newPrice);
    }

    public void setPrice() {
        // TODO Auto-generated method stub
        if (prices.containsKey(ingredientsType)) {
            unitcostIngredient = prices.get(ingredientsType);
        }
    }
}
