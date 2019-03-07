package main.java.p1;

public class Ingredients {

	IngredientsType ingredientsType;
	double unitcostAditionalIngredient;

	public double getCostAditionalIngredient(IngredientsType ingredientsType) {
		switch (ingredientsType) {
		case ASPARAGUS:
			return 1.1;
		case ANCHOES:
			return 2.1;
		case BROCCOLI:
			return 3.1;
		case MOZARELLA_CHEESE:
			return 3.0;
		case GREEKCHEESE:
			return 2.1;

		default:
			break;
		}

		return 0.0;

	}

	public IngredientsType getIngredientsType() {
		return ingredientsType;
	}

	public void setIngredientsType(IngredientsType ingredientsType) {
		this.ingredientsType = ingredientsType;
	}

}
