package main.java.p1;

public class GreekPizzaBranchA extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thick_dough;
    Ingredients greek_cheese;
    Ingredients olive;
    Ingredients tomato_slices;
    

    GreekPizzaBranchA() {
        super(PizzaTypes.GREEK);
        pizzaCost = PIZZA_COST_BASE;
        thick_dough = new Ingredients(IngredientType.THICK_DOUGH);
        greek_cheese = new Ingredients(IngredientType.GREEK_CHEESE);
        olive = new Ingredients(IngredientType.OLIVE);
        tomato_slices = new Ingredients(IngredientType.TOMATO_SLICES);

        ingredientsList.add(thick_dough);
        ingredientsList.add(greek_cheese);
        ingredientsList.add(olive);
        ingredientsList.add(tomato_slices);
    }
}
