package main.java.p1;

public class CheesePizzaBranchA extends Pizza {
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
    // }

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
