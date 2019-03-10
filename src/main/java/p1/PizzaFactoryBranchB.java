package main.java.p1;

public class PizzaFactoryBranchB extends AbstractFactory {

	@Override
	protected Pizza createPizza(PizzaTypes pizzaType) {
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
	protected Pizza createLasagana(LasagnaType lasagnaType) {
		// TODO Auto-generated method stub
		return null;
	}


	
}
