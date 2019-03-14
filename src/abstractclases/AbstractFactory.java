package abstractclases;

import java.util.ArrayList;

import pizza.AbstractPizza;
import pizza.Lasagna;
import pizza.LasagnaType;
import pizza.PizzaTypes;
import store.Order;

public abstract class AbstractFactory {
	public ArrayList<Order> orderList = new ArrayList<Order>();

	public abstract Order orderPizza(PizzaTypes type, int quantity);
	public abstract Order orderLasagna(LasagnaType type, int quantity);
	
	/*
	 * public Pizza orderPizza(PizzaTypes pizzaType) { Pizza pizza; pizza =
	 * createPizza(PizzaTypes type); pizza.prepare(); pizza.bake(); pizza.cut();
	 * pizza.box(); return pizza;
	 * 
	 * }
	 */

	public abstract AbstractPizza createPizza(PizzaTypes pizzaType);

	public abstract Lasagna createLasagana(LasagnaType lasagnaType);
}
