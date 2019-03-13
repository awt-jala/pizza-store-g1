package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.p1.AbstractPizza;
import main.java.p1.CheesePizzaBranchA;
import main.java.p1.CheesePizzaBranchB;
import main.java.p1.FactoryBranchA;
import main.java.p1.FactoryBranchB;
import main.java.p1.IngredientType;
import main.java.p1.Ingredients;
import main.java.p1.Lasagna;
import main.java.p1.LasagnaBranchA;
import main.java.p1.LasagnaBranchB;
import main.java.p1.LasagnaType;
import main.java.p1.PizzaTypes;

class AbstractFactoryTest {

	@Test
	void test_Create_Concrete_pizzaA() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		CheesePizzaBranchA objetc = new CheesePizzaBranchA();
		assertEquals(pizzaA.printType(), objetc.printType());
	}
	
	@Test
	void test_Create_Concrete_pizzaB() {
		final FactoryBranchB factoryB = new FactoryBranchB();
		final AbstractPizza pizzaB = factoryB.createPizza(PizzaTypes.CHEESE);
		CheesePizzaBranchB objet = new CheesePizzaBranchB();
		assertEquals(pizzaB.printType(), objet.printType());
	}

	@Test
	void test_Create_Concrete_LasagnaA() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final Lasagna lasagna = factoryA.createLasagana(LasagnaType.STANDAR);
		LasagnaBranchA object = new LasagnaBranchA();
		assertEquals(lasagna.printType(), object.printType());
	}
	
	@Test
	void test_Create_Concrete_LasagnaB() {
		final FactoryBranchB factoryB = new FactoryBranchB();
		final Lasagna lasagna = factoryB.createLasagana(LasagnaType.STANDAR);
		LasagnaBranchB object = new LasagnaBranchB();
		assertEquals(lasagna.printType(), object.printType());
	}
	
	@Test
	void test_Total_cost_current_ingredients() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		double expectedResult = 43.0;
		double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void test_Total_cost_aditional_ingredients() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Ingredients anchoeIngredient = new Ingredients(IngredientType.ANCHOES);
		pizzaA.aditionIngrediente(anchoeIngredient);
		double expectedResult = 51.5;
		double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_Total_cost_aditional_two_ingredients() {
		final FactoryBranchA factoryA = new FactoryBranchA();
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
		final FactoryBranchA factoryA = new FactoryBranchA();
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
