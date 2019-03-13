package main.java.p1;

public class CheesePizzaBranchB extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thin_dough;
    Ingredients plum_tomato_sauce;
    Ingredients mozarella_cheese;
    Ingredients parmesan_cheese;
    

    public CheesePizzaBranchB() {
        super(PizzaTypes.CHEESE);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients(IngredientType.THIN_DOUGH);
        mozarella_cheese = new Ingredients(IngredientType.MOZARELLA_CHEESE);
        parmesan_cheese = new Ingredients(IngredientType.PARMESAN_CHEESE);
        plum_tomato_sauce = new Ingredients(IngredientType.PLUM_TOMATO_SAUCE);

        ingredientsList.add(thin_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(parmesan_cheese);
        ingredientsList.add(plum_tomato_sauce);

    }

   

}
