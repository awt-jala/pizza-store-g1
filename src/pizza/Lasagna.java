package pizza;

import java.util.HashSet;

import abstractclases.Product;
import ingredient.IngredientsLasagna;

public abstract class Lasagna extends Product {

    private final LasagnaType lasagnaType;
    double lasagnaCost;
    HashSet<IngredientsLasagna> ingredientsList = new HashSet<IngredientsLasagna>();

    public HashSet<IngredientsLasagna> getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(HashSet<IngredientsLasagna> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}

	Lasagna(final LasagnaType lasagnaType) {
        this.lasagnaType = lasagnaType;
    }

    public String printType() {
        final String type = "LASAGNA " + lasagnaType;
        return type;
    }

    public void showIngredients() {
        for (final IngredientsLasagna ing : ingredientsList)
            // System.out.println(mandatoryIngredients);
            System.out.println(ing.getIngredientsType());
    }

    public final void removeIngrediente(final IngredientsLasagna ingredient) {
        ingredientsList.remove(ingredient);
    }

    public final void aditionIngrediente(final IngredientsLasagna ingredient) {
        ingredientsList.add(ingredient);
    }

    public double getTotalCostIngredientsList() {

        double sum = 0;
        for (final IngredientsLasagna ing : ingredientsList) {
            sum = sum + ing.getPrice();
        }

        return lasagnaCost + sum;
    }

    /*
     *
     * abstract void prepare(); abstract void bake(); abstract void deliver();
     */

}
