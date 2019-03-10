package main.java.p1;

import java.util.HashSet;

/**
 * This is a concrete class of superClass Pizza.
 *
 * @author CarlosRichter.
 * @version 1.0.
 */
public class CheesePizza extends Pizza {
    /** public double totalCost. */
    private static final double PIZZA_COST_BASE = 10;

    /**
     * This is a constructor of the CheesePizza class. below we can find the
     * price of a pizza without extra ingredients.
     */
    public CheesePizza() {
        super(PizzaTypes.CHEESE);
        pizzaCost = PIZZA_COST_BASE;

    }

    /**
     * Get Total cost.
     *
     * @return double
     */
    @Override
    public double totalCost(final HashSet<Ingredients> list) {
        double sum = 0;
        for (final Ingredients ing : list) {
            sum = sum + ing.getPrice();
        }

        return pizzaCost + sum;
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
