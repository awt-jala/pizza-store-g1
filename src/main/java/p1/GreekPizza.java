package main.java.p1;

/**
 * I don * This is a concrete class of Pizza.
 *
 * @author Admin.
 * @version 1.0
 */
public class GreekPizza extends Pizza {

    GreekPizza() {

        super(PizzaTypes.GREEK);
        pizzaCost = 11;
        /*
         * mandatoryIngredients.add(IngredientsType.MOZARELLA_CHEESE);
         * mandatoryIngredients.add(IngredientsType.TOMATO_SAUCE);
         * mandatoryIngredients.add(IngredientsType.TOMATO_SLICES);
         */
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
