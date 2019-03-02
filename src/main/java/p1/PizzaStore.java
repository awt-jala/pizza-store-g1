package main.java.p1;

import java.util.ArrayList;

public class PizzaStore {

	public ArrayList<Order> orderList;

	public void showMenu() {
	}

	public Order createOrder(PizzaTypes type, int quantity) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza = factory.create(type);
		Order orden = new Order(quantity, pizza);

		return orden;

	}

	public void getOrder(Order orden) {
	orderList.add(orden);
}

	/*public void getOrder(PizzaTypes product, int quantity) {
		orderList.add(createOrder(product, quantity));
	}*/

}
