package pizza;

import ingredient.IngredientType;
import ingredient.Ingredients;

public class PepperoniPizzaBranchA extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thin_dough;
    Ingredients plum_tomato_sauce;
    Ingredients mozarella_cheese;
    Ingredients parmesan_cheese;
    Ingredients pepperoni;

    public PepperoniPizzaBranchA() {
        super(PizzaTypes.PEPPERONI);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients(IngredientType.THIN_DOUGH);
        mozarella_cheese = new Ingredients(IngredientType.MOZARELLA_CHEESE);
        parmesan_cheese = new Ingredients(IngredientType.PARMESAN_CHEESE);
        plum_tomato_sauce = new Ingredients(IngredientType.PLUM_TOMATO_SAUCE);
        pepperoni = new Ingredients(IngredientType.PEPPERONI);

        ingredientsList.add(thin_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(parmesan_cheese);
        ingredientsList.add(plum_tomato_sauce);
        ingredientsList.add(pepperoni);

    }

    

}
