package main.java.p1;

import java.util.HashSet;

public class MainDeTesteo {

	public static void main(String[] args) {
		/*
		 * SimplePizzaFactory
		 * 
		 * public Pizza OrderPizza(PizzaTypes type) {
		 * 
		 * return pizza; }
		 */

		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza1 = factory.create(PizzaTypes.CHEESE);
		/*
		 * Pizza pizza2 = factory.create(PizzaTypes.GREEK); Pizza pizza3 =
		 * factory.create(PizzaTypes.PEPPERONI); Pizza pizza4 =
		 * factory.create(PizzaTypes.VEGGIE);
		 */

		pizza1.showIngredients();
		PizzaStore sucursal1 = new PizzaStore();
		// Order o1=sucursal1.createOrder(PizzaTypes.GREEK, 1);
		// sucursal1.addToOrderlist(o1);

		System.out.println("el costo de una pizza cheese es: " + pizza1.getPizzaCost());
		sucursal1.addToOrderlist(sucursal1.createOrder(PizzaTypes.GREEK, 1));
		sucursal1.addToOrderlist(sucursal1.createOrder(PizzaTypes.CHEESE, 2));

		for (Order o : sucursal1.orderList) {
			System.out.println(o.getQuantity());
			System.out.println(o.getPizza().PrintType2());
		}

		/*
		 * pizza1.PrintType2(); pizza2.PrintType2(); pizza3.PrintType2();
		 * pizza4.PrintType2();
		 */

		Ingredients i = new Ingredients();
		i.setIngredientsType(IngredientsType.ANCHOES);
		System.out.println("precio anchoas: "+i.getCostAditionalIngredient(IngredientsType.ANCHOES));
		Ingredients i2 = new Ingredients();
		i.setIngredientsType(IngredientsType.ASPARAGUS);
		
		HashSet<Ingredients> lista= new HashSet<Ingredients>();
		lista.add(i);
		lista.add(i2);
		
		System.out.println(lista);
		System.out.println(pizza1.totalCost(lista));
	}
	

}
