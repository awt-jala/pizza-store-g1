package main.java.p1;

import java.util.HashSet;

public class CheesePizzaBranchA extends Pizza {
	private static final double PIZZA_COST_BASE = 10;
	Ingredients ing1;
	Ingredients ing2;
	Ingredients ing3;
	
	
	CheesePizzaBranchA() {
		super(PizzaTypes.CHEESE);
		pizzaCost = PIZZA_COST_BASE;
		ing1= new Ingredients();
		ing1.setIngredientsType(IngredientType.THICK_DOUGH);
		ing1.setPrice();
		ing2= new Ingredients();
		ing2.setIngredientsType(IngredientType.PLUM_TOMATO_SAUCE);
		ing2.setPrice();
		ing3= new Ingredients();
		ing3.setIngredientsType(IngredientType.MOZARELLA_CHEESE);
		ing3.setPrice();
		
		ingredientsList.add(ing1);
		ingredientsList.add(ing2);
		ingredientsList.add(ing3);
	}
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
