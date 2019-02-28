package main.java.p1;

public  abstract class Pizza {
	private PizzaTypes pizzaType;

	Pizza(PizzaTypes pizzaType) {
		this.pizzaType = pizzaType;
	}

	public void menu() {
		System.out.println("PIZZA "+pizzaType);
	}
	
	/*public PizzaTypes getPizzaType() {
		return pizzaType;
	}

public void setPizzaType(PizzaTypes pizzaType) {
	this.pizzaType=pizzaType;
}
*/
}
