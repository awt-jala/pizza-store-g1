package main.java.p1;

public class VeggiePizzaBranchB extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thin_dough;
    Ingredients plum_tomato_sauce;
    Ingredients parmesan_cheese;
    Ingredients pineapple;
    Ingredients olive;
    Ingredients broccoli;
    Ingredients asparagus;
    Ingredients tomato_slices;
    VeggiePizzaBranchB() {
        super(PizzaTypes.VEGGIE);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients(IngredientType.THIN_DOUGH);
        parmesan_cheese = new Ingredients(IngredientType.PARMESAN_CHEESE);
        broccoli = new Ingredients(IngredientType.BROCCOLI);
        plum_tomato_sauce = new Ingredients(IngredientType.PLUM_TOMATO_SAUCE);
        olive = new Ingredients(IngredientType.OLIVE);
        asparagus = new Ingredients(IngredientType.ASPARAGUS);
        tomato_slices = new Ingredients(IngredientType.TOMATO_SLICES);
        pineapple = new Ingredients(IngredientType.PINEAPPLE);

        ingredientsList.add(thin_dough);
        ingredientsList.add(parmesan_cheese);
        ingredientsList.add(broccoli);
        ingredientsList.add(plum_tomato_sauce);
        ingredientsList.add(olive);
        ingredientsList.add(asparagus);
        ingredientsList.add(tomato_slices);
        ingredientsList.add(pineapple);
    }

    
}
