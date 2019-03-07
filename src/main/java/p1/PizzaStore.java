package main.java.p1;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;

public class PizzaStore {

	public ArrayList<Order> orderList = new ArrayList<Order>();

	public void showMenu() {
	}

	public Order createOrder(PizzaTypes type, int quantity) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = factory.create(type);
		Order orden = new Order(quantity, pizza);

		return orden;

	}

	public Order createCustomOrder(PizzaTypes type, int quantity, ArrayList<IngredientsType> IngredientesARemover) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = factory.create(type);

		for (IngredientsType Ing : IngredientesARemover) {

			pizza.optionalIngredients.remove(Ing);
		}
		pizza.showIngredients();

		Order orden = new Order(quantity, pizza);

		return orden;

	}

	public void addToOrderlist(Order orden) {
		orderList.add(orden);
	}

	/*
	 * public void getOrder(PizzaTypes product, int quantity) {
	 * orderList.add(createOrder(product, quantity)); }
	 */

}
