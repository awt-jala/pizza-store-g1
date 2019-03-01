package main.java.p1;

import java.util.ArrayList;

public class Client {
	int id;

	public Order clientRequest(ArrayList menu, Ingredients extras, int quantity){
	PizzaTypes type = null;
	Order ordenClient = new Order(quantity, type);	
	return ordenClient;
	}

}
