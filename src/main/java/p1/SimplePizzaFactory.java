package main.java.p1;

public class SimplePizzaFactory {

	public Pizza getInstance(PizzaTypes pizzaTypes) {
		switch (pizzaTypes) {
		case CHEESE:return new CheesePizza(); 
		case GREEK:return new GreekPizza();
		case PEPPERONI:return new PepperoniPizza();
		case VEGGIE:return new VeggiePizza();
		default: break;
		}
		return null;
	}
}
