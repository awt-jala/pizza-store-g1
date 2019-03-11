package main.java.p1;

import java.util.HashSet;

public abstract class Pizza extends Product {
    private final PizzaTypes pizzaType;
    double pizzaCost;

    HashSet<Ingredients> ingredientsList = new HashSet<Ingredients>();

    Pizza(final PizzaTypes pizzaType) {
        this.pizzaType = pizzaType;
        // this.ingredientsList = new HashSet<Ingredients>();

    }

    abstract void prepare();

    abstract void bake();

    abstract void cut();

    abstract void box();

    public HashSet<Ingredients> getIngredientsList() {
        return ingredientsList;
    }

    public void setIngredientsList(final HashSet<Ingredients> ingredientsList) {
        this.ingredientsList = ingredientsList;
    }

    public void showIngredients() {
        for (final Ingredients ing : ingredientsList)
            // System.out.println(mandatoryIngredients);
            System.out.println(ing.getIngredientsType());
    }

    public final void removeIngrediente(final Ingredients ingredient) {
        ingredientsList.remove(ingredient);
    }

    public final void aditionIngrediente(final Ingredients ingredient) {
        ingredientsList.add(ingredient);
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

    public double getTotalCostIngredientsList() {

        double sum = 0;
        for (final Ingredients ing : ingredientsList) {
            sum = sum + ing.getPrice();
        }

        return pizzaCost + sum;
    }
}
