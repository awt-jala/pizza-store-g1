package main.java.p1;

public class GreekPizzaBranchA extends Pizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thick_dough;
    Ingredients greek_cheese;
    Ingredients olive;
    Ingredients tomato_slices;
    

    GreekPizzaBranchA() {
        super(PizzaTypes.GREEK);
        pizzaCost = PIZZA_COST_BASE;
        thick_dough = new Ingredients();
        thick_dough.setIngredientsType(IngredientType.THICK_DOUGH);
        thick_dough.setPrice();
        greek_cheese = new Ingredients();
        greek_cheese.setIngredientsType(IngredientType.GREEK_CHEESE);
        greek_cheese.setPrice();
        olive = new Ingredients();
        olive.setIngredientsType(IngredientType.OLIVE);
        olive.setPrice();
        tomato_slices = new Ingredients();
        tomato_slices.setIngredientsType(IngredientType.TOMATO_SLICES);
        tomato_slices.setPrice();

        ingredientsList.add(thick_dough);
        ingredientsList.add(greek_cheese);
        ingredientsList.add(olive);
        ingredientsList.add(tomato_slices);
    }
}
