package factory;

import java.util.ArrayList;

import abstractclases.AbstractFactory;
import abstractclases.Product;
import pizza.AbstractPizza;
import pizza.CheesePizzaBranchA;
import pizza.GreekPizzaBranchA;
import pizza.Lasagna;
import pizza.LasagnaBranchA;
import pizza.LasagnaType;
import pizza.PepperoniPizzaBranchA;
import pizza.PizzaTypes;
import pizza.VeggiePizzaBranchA;
import store.Order;

public class FactoryBranchA extends AbstractFactory {
    double orderListCost = 0;

    public ArrayList<Order> orderList = new ArrayList<Order>();

    public FactoryBranchA() {
        // orderListCost = 0;
    }

    public double getOrderListCost() {
        return orderListCost;
    }

    public void setOrderListCost(final double orderListCost) {
        this.orderListCost = orderListCost;
    }

    @Override
    public Order orderPizza(final PizzaTypes type, final int quantity) {
        final FactoryBranchA factory = new FactoryBranchA();
        final Product pizza = factory.createPizza(type);
        final Order orden = new Order(quantity, pizza);

        return orden;
    }

    @Override
    public Order orderLasagna(final LasagnaType type, final int quantity) {
        final FactoryBranchA factory = new FactoryBranchA();
        final Product lasagna = factory.createLasagana(type);
        final Order orden = new Order(quantity, lasagna);

        return orden;
    }

    public void addToOrderlist(final Order orden) {
        orderList.add(orden);
    }

    @Override
    public AbstractPizza createPizza(final PizzaTypes pizzaType) {
        switch (pizzaType) {
        case CHEESE:
            return new CheesePizzaBranchA();
        case GREEK:
            return new GreekPizzaBranchA();
        case PEPPERONI:
            return new PepperoniPizzaBranchA();
        case VEGGIE:
            return new VeggiePizzaBranchA();
        default:
            break;
        }
        return null;
    }

    @Override
    public Lasagna createLasagana(final LasagnaType lasagnaType) {
        switch (lasagnaType) {
        case STANDAR:
            return new LasagnaBranchA();
        default:
            break;
        }
        return null;
    }

}
