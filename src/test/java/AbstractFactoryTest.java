package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import abstractclases.Product;
import factory.FactoryBranchA;
import factory.FactoryBranchB;
import ingredient.IngredientType;
import ingredient.Ingredients;
import pizza.AbstractPizza;
import pizza.CheesePizzaBranchA;
import pizza.CheesePizzaBranchB;
import pizza.Lasagna;
import pizza.LasagnaBranchA;
import pizza.LasagnaBranchB;
import pizza.LasagnaType;
import pizza.PizzaTypes;
import store.Order;
import store.PizzaStore;

class AbstractFactoryTest {

	@Test
	void test_Create_Concrete_pizzaA() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final Product pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final CheesePizzaBranchA objetc = new CheesePizzaBranchA();
		assertEquals(pizzaA.printType(), objetc.printType());
	}

	@Test
	void test_Create_Concrete_pizzaB() {
		final FactoryBranchB factoryB = new FactoryBranchB();
		final AbstractPizza pizzaB = factoryB.createPizza(PizzaTypes.CHEESE);
		final CheesePizzaBranchB objet = new CheesePizzaBranchB();
		assertEquals(pizzaB.printType(), objet.printType());
	}

	@Test
	void test_Create_Concrete_LasagnaA() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final Product lasagna = factoryA.createLasagana(LasagnaType.STANDAR);
		final LasagnaBranchA object = new LasagnaBranchA();
		assertEquals(lasagna.printType(), object.printType());
	}

	@Test
	void test_Create_Concrete_LasagnaB() {
		final FactoryBranchB factoryB = new FactoryBranchB();
		final Lasagna lasagna = factoryB.createLasagana(LasagnaType.STANDAR);
		final LasagnaBranchB object = new LasagnaBranchB();
		assertEquals(lasagna.printType(), object.printType());
	}

	@Test
	void test_Total_cost_current_ingredients() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final double expectedResult = 43.0;
		final double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void test_Total_cost_aditional_ingredients() {
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Ingredients anchoeIngredient = new Ingredients(IngredientType.ANCHOES);
		pizzaA.aditionIngrediente(anchoeIngredient);
		final double expectedResult = 51.5;
		final double actualResult = pizzaA.getTotalCostIngredientsList();
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
		final double expectedResult = 60;
		// System.out.println(pizzaA.getTotalCostIngredientsList());
		final double actualResult = pizzaA.getTotalCostIngredientsList();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_create_pizza_Order_BranchA() {
		final PizzaStore BranchA = new PizzaStore();
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		final Order orden = new Order(3, pizzaA);
		BranchA.addToOrderlist(orden);
		double actualResult = 0;
		final double expectedResult = orden.getOrderCost();
		actualResult = orden.getProduct().getTotalCostIngredientsList() * orden.getQuantity();
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void test_calculate_order_list_cost() {
		final PizzaStore BranchA = new PizzaStore();
		final FactoryBranchA factoryA = new FactoryBranchA();
		final AbstractPizza pizza1 = factoryA.createPizza(PizzaTypes.CHEESE);
		final AbstractPizza pizza2 = factoryA.createPizza(PizzaTypes.GREEK);
		final Lasagna lasagna1 = factoryA.createLasagana(LasagnaType.STANDAR);

		final Order o1 = new Order(1, pizza1);
		final Order o2 = new Order(1, pizza2);
		final Order o3 = new Order(1, lasagna1);
		BranchA.addToOrderlist(o1);
		BranchA.addToOrderlist(o2);
		BranchA.addToOrderlist(o3);
		double actualResult = 0;
		for (final Order o : BranchA.orderList) {
			actualResult = actualResult + o.getQuantity() * o.getOrderCost();
			System.out.println(o.getProduct().printType());
			System.out.println("precio base: " + o.getProduct().getTotalCostIngredientsList());
			System.out.println("cantidad: " + o.getQuantity());
			System.out.println("costo orden: " + o.getOrderCost());
		}
		System.out.println("el costo total calculado es: " + actualResult);
		System.out.println("el costo total es esperado es: " + BranchA.calculateOrderListCost());
		final double expectedResult = BranchA.calculateOrderListCost();
		assertEquals(expectedResult, actualResult);

		

	}

}
