package main.java.p1;

import java.util.HashSet;

public class MainDeTesteo {

    public static void main(final String[] args) {
        /*
         * SimplePizzaFactory
         *
         * public Pizza OrderPizza(PizzaTypes type) {
         *
         * return pizza; }
         */

        final SimplePizzaFactory factory = new SimplePizzaFactory();
        final AbstractPizza pizza1 = factory.create(PizzaTypes.CHEESE);
        /*
         * Pizza pizza2 = factory.create(PizzaTypes.GREEK); Pizza pizza3 =
         * factory.create(PizzaTypes.PEPPERONI); Pizza pizza4 =
         * factory.create(PizzaTypes.VEGGIE);
         */

        // pizza1.showIngredients();
        final PizzaStore sucursal1 = new PizzaStore();
        // Order o1=sucursal1.createOrder(PizzaTypes.GREEK, 1);
        // sucursal1.addToOrderlist(o1);

        System.out.println(
                "el costo de una pizza cheese es: " + pizza1.getPizzaCost());
        sucursal1.addToOrderlist(sucursal1.createOrder(PizzaTypes.GREEK, 1));
        sucursal1.addToOrderlist(sucursal1.createOrder(PizzaTypes.CHEESE, 2));

        for (final Order o : sucursal1.orderList) {
            System.out.println(o.getQuantity());
            System.out.println(o.getPizza().PrintType2());
        }

        /*
         * pizza1.PrintType2(); pizza2.PrintType2(); pizza3.PrintType2();
         * pizza4.PrintType2();
         */

        final Ingredients anchoeIngredient = new Ingredients(
                IngredientType.ANCHOES);
        // i.setIngredientsType(IngredientType.ANCHOES);
        // i.setPrice();

        // System.out.println("precio anchoas: " + i.getPrice());
        final Ingredients reggianoIngredient = new Ingredients(
                IngredientType.REGGIANO_CHEESE);
        // i2.setIngredientsType(IngredientType.REGGIANO_CHEESE);
        // i2.updatePrice(IngredientsType.ASPARAGUS, 100.0);
        // i2.setPrice();

        // System.out.println("precio Esparragos: " + i2.getPrice());
        double suma = 0;

        suma = anchoeIngredient.getPrice() + reggianoIngredient.getPrice();
        // suma = i.getPrice() + i2.getPrice();
        System.out.println("El total es : " + suma);

        final HashSet<Ingredients> lista = new HashSet<Ingredients>();
        lista.add(anchoeIngredient);
        lista.add(reggianoIngredient);

        System.out.println(lista);
        System.out.println(pizza1.totalCost(lista));

        System.out.println("---------------------------------------");
        final PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        // pizzaA.ingredientsList;
        pizzaA.showIngredients();
        pizzaA.aditionIngrediente(anchoeIngredient);
        pizzaA.showIngredients();
        // pizzaA.removeIngrediente();
        // pizzaA.showIngredients();
        //System.out.println(pizzaA.getTotalCostIngredientsList());

    }

}
