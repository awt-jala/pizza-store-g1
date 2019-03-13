package main.java.p1;

public class PizzafactoryBranchA extends AbstractFactory {

	@Override
	protected AbstractPizza createPizza(PizzaTypes pizzaType) {
		switch (pizzaType) {
		case CHEESE:return new CheesePizzaBranchA(); 
		case GREEK:return new GreekPizzaBranchA();
		case PEPPERONI:return new PepperoniPizzaBranchA();
		case VEGGIE:return new VeggiePizzaBranchA();
		default: break;
		}
		return null;
	}

	@Override
	protected Lasagna createLasagana(LasagnaType lasagnaType) {
		switch (lasagnaType) {
		case STANDAR:return new LasagnaBranchA(); 
		default: break;
		}
		return null;
	}


}

