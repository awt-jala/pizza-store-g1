package main.java.p1;

import java.util.ArrayList;

public class FactoryBranchB extends AbstractFactory {
	public ArrayList<Order> orderList = new ArrayList<Order>();
	
	@Override
	public Order orderPizza(PizzaTypes type, int quantity) {
		FactoryBranchB factory = new FactoryBranchB();
		Product pizza = factory.createPizza(type);
		Order orden = new Order(quantity, pizza);

		return orden;
	}

	@Override
	public Order orderLasagna(LasagnaType type, int quantity) {
		FactoryBranchB factory = new FactoryBranchB();
		Product lasagna = factory.createLasagana(type);
		Order orden = new Order(quantity, lasagna);

		return orden;	
	}

	@Override
	public AbstractPizza createPizza(PizzaTypes pizzaType) {
		switch (pizzaType) {
		case CHEESE:return new CheesePizzaBranchB(); 
		case GREEK:return new GreekPizzaBranchB();
		case PEPPERONI:return new PepperoniPizzaBranchB();
		case VEGGIE:return new VeggiePizzaBranchB();
		default: break;
		}
		return null;
	}

	@Override
	public Lasagna createLasagana(LasagnaType lasagnaType) {
		switch (lasagnaType) {
		case STANDAR:return new LasagnaBranchB(); 
		default: break;
		}
		return null;
	}

	

	
}
