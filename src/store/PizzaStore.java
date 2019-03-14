package store;

import java.util.ArrayList;

public class PizzaStore {

    public ArrayList<Order> orderList = new ArrayList<Order>();

    public double calculateOrderListCost() {
        double orderListCost = 0;
        for (final Order o : orderList) {
            orderListCost = orderListCost + o.getOrderCost();
        }
        return orderListCost;
    }

    public void addToOrderlist(final Order orden) {
        orderList.add(orden);
    }

}
