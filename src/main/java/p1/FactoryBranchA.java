package main.java.p1;

import java.util.ArrayList;

public class FactoryBranchA extends AbstractFactory {
	double orderListCost;

	public ArrayList<Order> orderList = new ArrayList<Order>();

	FactoryBranchA() {
		orderListCost =0;
		for (final Order o : orderList) {

			orderListCost =orderListCost+ o.getOrderCost();
		}
	}

	public double getOrderListCost() {
		return orderListCost;
	}

	public void setOrderListCost(double orderListCost) {
		this.orderListCost = orderListCost;
	}

	@Override
	public Order orderPizza(PizzaTypes type, int quantity) {
		FactoryBranchA factory = new FactoryBranchA();
		Product pizza = factory.createPizza(type);
		Order orden = new Order(quantity, pizza);

		return orden;
	}

	@Override
	public Order orderLasagna(LasagnaType type, int quantity) {
		FactoryBranchA factory = new FactoryBranchA();
		Product lasagna = factory.createLasagana(type);
		Order orden = new Order(quantity, lasagna);

		return orden;
	}

	public void addToOrderlist(Order orden) {
		orderList.add(orden);
	}

	@Override
	public AbstractPizza createPizza(PizzaTypes pizzaType) {
		switch (pizzaType) {
		case CHEESE:
			return new CheesePizzaBranchA();
		case GREEK:
			return new GreekPizzaBranchA();
		case PEPPERONI:
			return new PepperoniPizzaBranchA();
		case VEGGIE:
			return new VeggiePizzaBranchA();
		default:
			break;
		}
		return null;
	}

	@Override
	public Lasagna createLasagana(LasagnaType lasagnaType) {
		switch (lasagnaType) {
		case STANDAR:
			return new LasagnaBranchA();
		default:
			break;
		}
		return null;
	}

}
