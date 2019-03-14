package test.java;

import factory.FactoryBranchA;
import ingredient.IngredientType;
import ingredient.Ingredients;
import pizza.AbstractPizza;
import pizza.PizzaTypes;
import store.Order;

public class Mani {

    public static void main(final String[] args) {

        /*
         * final FactoryBranchA sucursalA = new FactoryBranchA();
         * sucursalA.addToOrderlist(sucursalA.orderPizza(PizzaTypes.GREEK, 1));
         * sucursalA.addToOrderlist(sucursalA.orderPizza(PizzaTypes.PEPPERONI,
         * 2));
         * sucursalA.addToOrderlist(sucursalA.orderLasagna(LasagnaType.STANDAR,
         * 2));
         *
         * for (final Order o : sucursalA.orderList) {
         *
         * System.out.println(o.getProduct().printType());
         * System.out.println("precio base: "+o.getProduct().
         * getTotalCostIngredientsList()); System.out.println("cantidad: "+
         * o.getQuantity()); System.out.println("costo orden: "+
         * o.getOrderCost());
         *
         * }
         *
         * System.out.println("el costo total es: "+sucursalA.getOrderListCost()
         * );
         */
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        final Ingredients anchoeIngredient = new Ingredients(
                IngredientType.ANCHOES);
        // pizzaA.aditionIngrediente(anchoeIngredient);
        final Order orden = new Order(3, pizzaA);
        factoryA.addToOrderlist(orden);

        for (final Order o : factoryA.orderList) {

            System.out.println(o.getProduct().printType());
            System.out.println("precio base: "
                    + o.getProduct().getTotalCostIngredientsList());
            System.out.println("cantidad: " + o.getQuantity());
            System.out.println("costo orden: " + o.getOrderCost());

        }

    }

}
