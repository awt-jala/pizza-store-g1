package main.java.p1;

public abstract class AbstractFactory {

	  /*public Pizza orderPizza(PizzaTypes pizzaType) {
	      Pizza pizza;
	     pizza = createPizza(PizzaTypes type);
	      pizza.prepare();
	      pizza.bake();
	      pizza.cut();
	      pizza.box();
	      return pizza;
	  
	  }*/

	protected abstract AbstractPizza createPizza(PizzaTypes pizzaType);

	protected abstract Lasagna createLasagana(LasagnaType lasagnaType);
}
