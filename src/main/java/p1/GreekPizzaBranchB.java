package main.java.p1;

public class GreekPizzaBranchB extends Pizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thick_dough;
    Ingredients thin_dough;
    Ingredients plum_tomato_sauce;
    Ingredients marinara_sauce;
    Ingredients mozarella_cheese;
    Ingredients reggiano_cheese;
    Ingredients greek_cheese;
    Ingredients parmesan_cheese;
    Ingredients frozen_clam;
    Ingredients fresh_clam;
    Ingredients anchoes;
    Ingredients pineapple;
    Ingredients olive;
    Ingredients broccoli;
    Ingredients asparagus;
    Ingredients tomato_slices;
    Ingredients ham;
    Ingredients salame;
    Ingredients pepperoni;
    Ingredients spicy_sauce;

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

        ingredientsList.add(thick_dough);
        ingredientsList.add(greek_cheese);
        ingredientsList.add(olive);
        ingredientsList.add(tomato_slices);
        ingredientsList.add(asparagus);
    }

    @Override
    void prepare() {
        // TODO Auto-generated method stub

    }

    @Override
    void bake() {
        // TODO Auto-generated method stub

    }

    @Override
    void cut() {
        // TODO Auto-generated method stub

    }

    @Override
    void box() {
        // TODO Auto-generated method stub

    }

}
