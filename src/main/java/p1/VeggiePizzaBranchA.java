package main.java.p1;

public class VeggiePizzaBranchA extends AbstractPizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thick_dough;
    Ingredients plum_tomato_sauce;
    Ingredients mozarella_cheese;
    Ingredients pineapple;
    Ingredients olive;
    Ingredients broccoli;
    Ingredients tomato_slices;
    Ingredients asparagus;

    VeggiePizzaBranchA() {
        super(PizzaTypes.VEGGIE);
        pizzaCost = PIZZA_COST_BASE;
        thick_dough = new Ingredients(IngredientType.THICK_DOUGH);
        mozarella_cheese = new Ingredients(IngredientType.MOZARELLA_CHEESE);
        broccoli = new Ingredients(IngredientType.BROCCOLI);
        plum_tomato_sauce = new Ingredients(IngredientType.PLUM_TOMATO_SAUCE);
        olive = new Ingredients(IngredientType.OLIVE);
        asparagus = new Ingredients(IngredientType.ASPARAGUS);
        tomato_slices = new Ingredients(IngredientType.TOMATO_SLICES);
        pineapple = new Ingredients(IngredientType.PINEAPPLE);

        ingredientsList.add(thick_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(broccoli);
        ingredientsList.add(plum_tomato_sauce);
        ingredientsList.add(olive);
        ingredientsList.add(asparagus);
        ingredientsList.add(tomato_slices);
        ingredientsList.add(pineapple);
    }

    

}
