package main.java.p1;

public class FactoryBranchB extends AbstractFactory {

	@Override
	public AbstractPizza createPizza(PizzaTypes pizzaType) {
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
	public Lasagna createLasagana(LasagnaType lasagnaType) {
		switch (lasagnaType) {
		case STANDAR:return new LasagnaBranchB(); 
		default: break;
		}
		return null;
	}


	
}
