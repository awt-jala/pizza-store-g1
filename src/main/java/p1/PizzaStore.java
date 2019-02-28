package main.java.p1;

public class PizzaStore {
	public static void main(String arg[]) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza1 = factory.getInstance(PizzaTypes.CHEESE);
		Pizza pizza2 = factory.getInstance(PizzaTypes.GREEK);
		Pizza pizza3 = factory.getInstance(PizzaTypes.PEPPERONI);
		Pizza pizza4 = factory.getInstance(PizzaTypes.VEGGIE);

		pizza1.menu();
		pizza2.menu();
		pizza3.menu();
		pizza4.menu();

	}
}
