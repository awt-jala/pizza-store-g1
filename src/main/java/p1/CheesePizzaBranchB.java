package main.java.p1;

public class CheesePizzaBranchB extends Pizza {
	private static final double PIZZA_COST_BASE = 10;
	Ingredients ing1;
	Ingredients ing2;
	Ingredients ing3;
	
	public CheesePizzaBranchB() {
		super(PizzaTypes.CHEESE);
		pizzaCost = PIZZA_COST_BASE;

	
	}
	
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub

	}

	@Override
	void bake() {
		// TODO Auto-generated method stub

	}

	@Override
	void cut() {
		// TODO Auto-generated method stub

	}

	@Override
	void box() {
		// TODO Auto-generated method stub

	}

}
