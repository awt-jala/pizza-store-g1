package main.java.p1;

public class VeggiePizzaBranchA extends Pizza {
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
        thick_dough = new Ingredients();
        thick_dough.setIngredientsType(IngredientType.THICK_DOUGH);
        thick_dough.setPrice();
        mozarella_cheese = new Ingredients();
        mozarella_cheese.setIngredientsType(IngredientType.MOZARELLA_CHEESE);
        mozarella_cheese.setPrice();
        broccoli = new Ingredients();
        broccoli.setIngredientsType(IngredientType.BROCCOLI);
        broccoli.setPrice();
        plum_tomato_sauce = new Ingredients();
        plum_tomato_sauce.setIngredientsType(IngredientType.PLUM_TOMATO_SAUCE);
        plum_tomato_sauce.setPrice();
        olive = new Ingredients();
        olive.setIngredientsType(IngredientType.OLIVE);
        olive.setPrice();
        asparagus = new Ingredients();
        asparagus.setIngredientsType(IngredientType.ASPARAGUS);
        asparagus.setPrice();
        tomato_slices = new Ingredients();
        tomato_slices.setIngredientsType(IngredientType.TOMATO_SLICES);
        tomato_slices.setPrice();
        pineapple = new Ingredients();
        pineapple.setIngredientsType(IngredientType.PINEAPPLE);
        pineapple.setPrice();

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
