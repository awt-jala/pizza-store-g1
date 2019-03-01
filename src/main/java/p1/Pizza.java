package main.java.p1;

public  abstract class Pizza {
	private PizzaTypes pizzaType;

	Pizza(PizzaTypes pizzaType) {
		this.pizzaType = pizzaType;
	}

	public String PrintType2() {
		String type="PIZZA "+pizzaType;
				//+pizzaType);
	return type;
	}
	
	/*public PizzaTypes getPizzaType() {
		return pizzaType;
	}

public void setPizzaType(PizzaTypes pizzaType) {
	this.pizzaType=pizzaType;
}
*/
}
