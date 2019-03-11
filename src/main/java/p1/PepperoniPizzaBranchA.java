package main.java.p1;

public class PepperoniPizzaBranchA extends Pizza {
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

    PepperoniPizzaBranchA() {
        super(PizzaTypes.PEPPERONI);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients();
        thin_dough.setIngredientsType(IngredientType.THIN_DOUGH);
        thin_dough.setPrice();
        mozarella_cheese = new Ingredients();
        mozarella_cheese.setIngredientsType(IngredientType.MOZARELLA_CHEESE);
        mozarella_cheese.setPrice();
        parmesan_cheese = new Ingredients();
        parmesan_cheese.setIngredientsType(IngredientType.PARMESAN_CHEESE);
        parmesan_cheese.setPrice();
        plum_tomato_sauce = new Ingredients();
        plum_tomato_sauce.setIngredientsType(IngredientType.PLUM_TOMATO_SAUCE);
        plum_tomato_sauce.setPrice();
        pepperoni = new Ingredients();
        pepperoni.setIngredientsType(IngredientType.PEPPERONI);
        pepperoni.setPrice();

        ingredientsList.add(thin_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(parmesan_cheese);
        ingredientsList.add(plum_tomato_sauce);
        ingredientsList.add(pepperoni);

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
