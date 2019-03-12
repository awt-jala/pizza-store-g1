package main.java.p1;

public class PizzaFactoryBranchB extends AbstractFactory {

	@Override
	protected AbstractPizza createPizza(PizzaTypes pizzaType) {
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
	protected Lasagna createLasagana(LasagnaType lasagnaType) {
		switch (lasagnaType) {
		case STANDAR:return new LasagnaBranchB(); 
		default: break;
		}
		return null;
	}


	
}
