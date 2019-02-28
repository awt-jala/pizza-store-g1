package main.java.p1;

public class PizzaFactory {

	public Pizza getInstance(PizzaTypes pizzaTypes) {
		switch (pizzaTypes) {
		case CHEESE:return new Cheese(); 
		case GREEK:return new Greek();
		case PEPPERONI:return new Pepperoni();
		case VEGGIE:return new Veggie();
		default: break;
		}
		return null;
	}
}
