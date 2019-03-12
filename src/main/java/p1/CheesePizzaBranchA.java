package main.java.p1;

public class CheesePizzaBranchA extends Pizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thick_dough;
    Ingredients plum_tomato_sauce;
    Ingredients mozarella_cheese;
    Ingredients reggiano_cheese;
    

    CheesePizzaBranchA() {
        super(PizzaTypes.CHEESE);
        pizzaCost = PIZZA_COST_BASE;
        thick_dough = new Ingredients();
        thick_dough.setIngredientsType(IngredientType.THICK_DOUGH);
        thick_dough.setPrice();
        mozarella_cheese = new Ingredients();
        mozarella_cheese.setIngredientsType(IngredientType.MOZARELLA_CHEESE);
        mozarella_cheese.setPrice();
        reggiano_cheese = new Ingredients();
        reggiano_cheese.setIngredientsType(IngredientType.REGGIANO_CHEESE);
        reggiano_cheese.setPrice();
        plum_tomato_sauce = new Ingredients();
        plum_tomato_sauce.setIngredientsType(IngredientType.PLUM_TOMATO_SAUCE);
        plum_tomato_sauce.setPrice();

        ingredientsList.add(thick_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(reggiano_cheese);
        ingredientsList.add(plum_tomato_sauce);
    }  
    
}
