package main.java.p1;

import java.util.HashSet;

public abstract class Pizza {
    private final PizzaTypes pizzaType;
    double pizzaCost;

    // HashSet<Ingredients> mandatoryIngredients;
    HashSet<Ingredients> optionalIngredients;

    Pizza(final PizzaTypes pizzaType) {
        this.pizzaType = pizzaType;
        optionalIngredients = new HashSet<Ingredients>();
        /*
         * optionalIngredients.add(IngredientsType.ANCHOES);
         * optionalIngredients.add(IngredientsType.OLIVE);
         * optionalIngredients.add(IngredientsType.PINEAPPLE);
         * optionalIngredients.add(IngredientsType.SPICY_SAUCE);
         * optionalIngredients.add(IngredientsType.SALAME);
         */
        // mandatoryIngredients = new HashSet<Ingredients>();
    }

    /**
     * Show Ingredients
     * @return 
     */
    
    abstract void prepare();
    abstract void bake();
    abstract void cut();
    abstract void box();
    
    public void showIngredients() {
        // System.out.println(mandatoryIngredients);
        System.out.println(optionalIngredients);
    }

    public final void removeIngrediente(final Ingredients ingredient) {
        optionalIngredients.remove(ingredient);
    }

    public final void aditionIngrediente(final Ingredients ingredient) {
        optionalIngredients.add(ingredient);
    }

    public String PrintType2() {
        final String type = "PIZZA " + pizzaType;
        return type;
    }

    public double getPizzaCost() {
        return pizzaCost;
    }

    public void setPizzaCost(final double pizzaCost) {
        this.pizzaCost = pizzaCost;
    }

    public double totalCost(final HashSet<Ingredients> list) {
        double sum = 0;
        for (final Ingredients ing : list) {
            sum = sum + ing.getPrice();
        }

        return pizzaCost + sum;
    }

}
