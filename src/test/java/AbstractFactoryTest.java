package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.p1.AbstractPizza;
import main.java.p1.CheesePizzaBranchA;
import main.java.p1.CheesePizzaBranchB;
import main.java.p1.FactoryBranchA;
import main.java.p1.FactoryBranchB;
import main.java.p1.IngredientType;
import main.java.p1.Ingredients;
import main.java.p1.Lasagna;
import main.java.p1.LasagnaBranchA;
import main.java.p1.LasagnaBranchB;
import main.java.p1.LasagnaType;
import main.java.p1.Order;
import main.java.p1.PizzaTypes;
import main.java.p1.Product;

class AbstractFactoryTest {

    @Test
    void test_Create_Concrete_pizzaA() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final Product pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        final CheesePizzaBranchA objetc = new CheesePizzaBranchA();
        assertEquals(pizzaA.printType(), objetc.printType());
    }

    @Test
    void test_Create_Concrete_pizzaB() {
        final FactoryBranchB factoryB = new FactoryBranchB();
        final AbstractPizza pizzaB = factoryB.createPizza(PizzaTypes.CHEESE);
        final CheesePizzaBranchB objet = new CheesePizzaBranchB();
        assertEquals(pizzaB.printType(), objet.printType());
    }

    @Test
    void test_Create_Concrete_LasagnaA() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final Product lasagna = factoryA.createLasagana(LasagnaType.STANDAR);
        final LasagnaBranchA object = new LasagnaBranchA();
        assertEquals(lasagna.printType(), object.printType());
    }

    @Test
    void test_Create_Concrete_LasagnaB() {
        final FactoryBranchB factoryB = new FactoryBranchB();
        final Lasagna lasagna = factoryB.createLasagana(LasagnaType.STANDAR);
        final LasagnaBranchB object = new LasagnaBranchB();
        assertEquals(lasagna.printType(), object.printType());
    }

    @Test
    void test_Total_cost_current_ingredients() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        final double expectedResult = 43.0;
        final double actualResult = pizzaA.getTotalCostIngredientsList();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void test_Total_cost_aditional_ingredients() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        final Ingredients anchoeIngredient = new Ingredients(
                IngredientType.ANCHOES);
        pizzaA.aditionIngrediente(anchoeIngredient);
        final double expectedResult = 51.5;
        final double actualResult = pizzaA.getTotalCostIngredientsList();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_Total_cost_aditional_two_ingredients() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        final Ingredients anchoeIngredient = new Ingredients(
                IngredientType.ANCHOES);
        pizzaA.aditionIngrediente(anchoeIngredient);
        final Ingredients pepperoniIngredient = new Ingredients(
                IngredientType.PEPPERONI);
        pizzaA.aditionIngrediente(pepperoniIngredient);
        final double expectedResult = 60;
        // System.out.println(pizzaA.getTotalCostIngredientsList());
        final double actualResult = pizzaA.getTotalCostIngredientsList();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_Total_cost_remove_ingredients() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        pizzaA.removeIngrediente(IngredientType.MOZARELLA_CHEESE);
        // System.out.println(mozarellaIngredient.getUnitcostIngredient());
        pizzaA.showIngredients();
        final double expectedResult = 38.5;
        final double actualResult = pizzaA.getTotalCostIngredientsList();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void test_create_pizza_Order_BranchA() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
        final Order orden = new Order(3, pizzaA);
        factoryA.addToOrderlist(orden);
        double actualResult = 0;
        final double expectedResult = orden.getOrderCost();
        actualResult = orden.getProduct().getTotalCostIngredientsList()
                * orden.getQuantity();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_calculate_order_list_cost() {
        final FactoryBranchA sucursalA = new FactoryBranchA();
        sucursalA.addToOrderlist(sucursalA.orderPizza(PizzaTypes.GREEK, 1));
        sucursalA.addToOrderlist(sucursalA.orderPizza(PizzaTypes.PEPPERONI, 2));
        sucursalA
                .addToOrderlist(sucursalA.orderLasagna(LasagnaType.STANDAR, 2));
        double actualResult = 0;
        for (final Order o : sucursalA.orderList) {
            actualResult = actualResult + o.getQuantity() * o.getOrderCost();
            System.out.println(o.getProduct().printType());
            System.out.println("precio base: "
                    + o.getProduct().getTotalCostIngredientsList());
            System.out.println("cantidad: " + o.getQuantity());
            System.out.println("costo orden: " + o.getOrderCost());
        }
        final double expectedResult = sucursalA.getOrderListCost();
        assertEquals(expectedResult, actualResult);

        System.out
                .println("el costo total es: " + sucursalA.getOrderListCost());
    }

}
