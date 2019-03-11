package main.java.p1;

import java.util.HashMap;
import java.util.Map;

public class Ingredients {

    IngredientType ingredientsType;
    double unitcostIngredient = 0;
    Map<IngredientType, Double> prices = new HashMap<IngredientType, Double>();

    Ingredients() {
        prices.put(IngredientType.THICK_DOUGH, 15.00);
        prices.put(IngredientType.THIN_DOUGH, 10.0);
        prices.put(IngredientType.PLUM_TOMATO_SAUCE, 7.50);
        prices.put(IngredientType.MARINARA_SAUCE, 5.7);
        prices.put(IngredientType.MOZARELLA_CHEESE, 4.50);
        prices.put(IngredientType.REGGIANO_CHEESE, 6.0);
        prices.put(IngredientType.GREEK_CHEESE, 9.00);
        prices.put(IngredientType.PARMESAN_CHEESE, 5.7);
        prices.put(IngredientType.FROZEN_CLAM, 7.50);
        prices.put(IngredientType.FRESH_CLAM, 10.0);
        prices.put(IngredientType.ANCHOES, 8.50);
        prices.put(IngredientType.PINEAPPLE, 4.0);
        prices.put(IngredientType.OLIVE, 3.50);
        prices.put(IngredientType.BROCCOLI, 5.0);
        prices.put(IngredientType.ASPARAGUS, 5.50);
        prices.put(IngredientType.TOMATO_SLICES, 3.5);
        prices.put(IngredientType.HAM, 5.50);
        prices.put(IngredientType.SALAME, 8.0);
        prices.put(IngredientType.PEPPERONI, 8.50);
        prices.put(IngredientType.SPICY_SAUCE, 3.0);

    }

    public double getPrice() {
        return unitcostIngredient;
        /*
         * if(prices.containsKey(ingredientsType)) { unitcostAditionalIngredient
         * = prices.get(ingredientsType); return unitcostAditionalIngredient; }
         * else { //loguear un error return 0.0; }
         */
    }

    public void updatePrice(final IngredientType ing, final double newPrice) {
        prices.put(ing, newPrice);
    }

    public IngredientType getIngredientsType() {
        return ingredientsType;
    }

    public void setIngredientsType(final IngredientType ingredientsType) {
        this.ingredientsType = ingredientsType;
    }

    public void setPrice() {
        // TODO Auto-generated method stub
        if (prices.containsKey(ingredientsType)) {
            unitcostIngredient = prices.get(ingredientsType);
        }
    }

}
