package main.java.p1;

import java.util.ArrayList;

public class PizzaStore {

	public ArrayList<Order> orderList;

	public void showMenu() {
	}

	public Order createOrder (PizzaTypes type, int quantity) {
		Order orden= new Order(quantity,type);
		
		return orden;
		
	}
}
