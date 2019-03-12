package main.java.p1;

public class GreekPizzaBranchB extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thin_dough;
    Ingredients greek_cheese;
    Ingredients olive;
    Ingredients asparagus;
    Ingredients tomato_slices;
    

    GreekPizzaBranchB() {
        super(PizzaTypes.GREEK);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients(IngredientType.THIN_DOUGH);
        greek_cheese = new Ingredients(IngredientType.GREEK_CHEESE);
        olive = new Ingredients(IngredientType.OLIVE);
        tomato_slices = new Ingredients(IngredientType.TOMATO_SLICES);
        asparagus = new Ingredients(IngredientType.ASPARAGUS);
       

        ingredientsList.add(thin_dough);
        ingredientsList.add(greek_cheese);
        ingredientsList.add(olive);
        ingredientsList.add(tomato_slices);
        ingredientsList.add(asparagus);
    }

   

}
