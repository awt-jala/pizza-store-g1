package pizza;

import ingredient.IngredientType;
import ingredient.Ingredients;

public class PepperoniPizzaBranchB extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thick_dough;
    Ingredients plum_tomato_sauce;
    Ingredients mozarella_cheese;
    Ingredients reggiano_cheese;
    Ingredients pepperoni;

    public PepperoniPizzaBranchB() {
        super(PizzaTypes.PEPPERONI);
        pizzaCost = PIZZA_COST_BASE;
        thick_dough = new Ingredients(IngredientType.THICK_DOUGH);
        mozarella_cheese = new Ingredients(IngredientType.MOZARELLA_CHEESE);
        reggiano_cheese = new Ingredients(IngredientType.REGGIANO_CHEESE);
        plum_tomato_sauce = new Ingredients(IngredientType.PLUM_TOMATO_SAUCE);
        pepperoni = new Ingredients(IngredientType.PEPPERONI);
        
        ingredientsList.add(thick_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(reggiano_cheese);
        ingredientsList.add(plum_tomato_sauce);
        ingredientsList.add(pepperoni);
    }

    

}
