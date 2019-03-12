package main.java.p1;

public class GreekPizzaBranchB extends Pizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thin_dough;
    Ingredients greek_cheese;
    Ingredients olive;
    Ingredients asparagus;
    Ingredients tomato_slices;
    

    GreekPizzaBranchB() {
        super(PizzaTypes.GREEK);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients();
        thin_dough.setIngredientsType(IngredientType.THIN_DOUGH);
        thin_dough.setPrice();
        greek_cheese = new Ingredients();
        greek_cheese.setIngredientsType(IngredientType.GREEK_CHEESE);
        greek_cheese.setPrice();
        olive = new Ingredients();
        olive.setIngredientsType(IngredientType.OLIVE);
        olive.setPrice();
        tomato_slices = new Ingredients();
        tomato_slices.setIngredientsType(IngredientType.TOMATO_SLICES);
        tomato_slices.setPrice();
        asparagus = new Ingredients();
        asparagus.setIngredientsType(IngredientType.ASPARAGUS);
        asparagus.setPrice();

        ingredientsList.add(thin_dough);
        ingredientsList.add(greek_cheese);
        ingredientsList.add(olive);
        ingredientsList.add(tomato_slices);
        ingredientsList.add(asparagus);
    }

   

}
