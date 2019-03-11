package main.java.p1;

public class VeggiePizzaBranchB extends Pizza {
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

    VeggiePizzaBranchB() {
        super(PizzaTypes.VEGGIE);
        pizzaCost = PIZZA_COST_BASE;
        thin_dough = new Ingredients();
        thin_dough.setIngredientsType(IngredientType.THIN_DOUGH);
        thin_dough.setPrice();
        parmesan_cheese = new Ingredients();
        parmesan_cheese.setIngredientsType(IngredientType.PARMESAN_CHEESE);
        parmesan_cheese.setPrice();
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

        ingredientsList.add(thin_dough);
        ingredientsList.add(parmesan_cheese);
        ingredientsList.add(broccoli);
        ingredientsList.add(plum_tomato_sauce);
        ingredientsList.add(olive);
        ingredientsList.add(asparagus);
        ingredientsList.add(tomato_slices);
        ingredientsList.add(pineapple);
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
