package main.java.p1;

public class CheesePizzaBranchB extends Pizza {
    private static final double PIZZA_COST_BASE = 10;
    Ingredients thin_dough;
    Ingredients plum_tomato_sauce;
    Ingredients mozarella_cheese;
    Ingredients parmesan_cheese;
    

    public CheesePizzaBranchB() {
        super(PizzaTypes.CHEESE);
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

        ingredientsList.add(thin_dough);
        ingredientsList.add(mozarella_cheese);
        ingredientsList.add(parmesan_cheese);
        ingredientsList.add(plum_tomato_sauce);

    }

   

}
