package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.p1.AbstractPizza;
import main.java.p1.CheesePizzaBranchA;

import main.java.p1.IngredientType;
import main.java.p1.Ingredients;
import main.java.p1.PizzaTypes;
import main.java.p1.PizzafactoryBranchA;

class AbstractFactoryTest {

	@Test
	void test_Create_Concrete_pizzaA() {
		final PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		CheesePizzaBranchA objetc = new CheesePizzaBranchA();
		assertEquals(pizzaA.PrintType2(), objetc.PrintType2());
	}

	@Test
	void test_Total_cost_current_ingredients() {
		final PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		double expectedResult = 43.0;
		double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void test_Total_cost_aditional_ingredients() {
		final PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Ingredients anchoeIngredient = new Ingredients(IngredientType.ANCHOES);
		pizzaA.aditionIngrediente(anchoeIngredient);
		double expectedResult = 51.5;
		double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_Total_cost_aditional_two_ingredients() {
		final PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Ingredients anchoeIngredient = new Ingredients(IngredientType.ANCHOES);
		pizzaA.aditionIngrediente(anchoeIngredient);
		final Ingredients pepperoniIngredient = new Ingredients(IngredientType.PEPPERONI);
		pizzaA.aditionIngrediente(pepperoniIngredient);
		double expectedResult = 60;
		// System.out.println(pizzaA.getTotalCostIngredientsList());
		double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_Total_cost_remove_ingredients() {
		final PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Ingredients mozarellaIngredient = new Ingredients(IngredientType.MOZARELLA_CHEESE);
		pizzaA.removeIngrediente(mozarellaIngredient);
		// System.out.println(mozarellaIngredient.getUnitcostIngredient());
		pizzaA.showIngredients();
		double expectedResult = 38.5;
		double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);

	}
}
