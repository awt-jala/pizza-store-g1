package main.java.p1;

public class FactoryBranchA extends AbstractFactory {

	@Override
	public AbstractPizza createPizza(PizzaTypes pizzaType) {
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
	public Lasagna createLasagana(LasagnaType lasagnaType) {
		switch (lasagnaType) {
		case STANDAR:return new LasagnaBranchA(); 
		default: break;
		}
		return null;
	}


}

