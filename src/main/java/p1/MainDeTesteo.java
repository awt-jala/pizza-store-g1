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

		//pizza1.showIngredients();
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
		i.setIngredientsType(IngredientType.ANCHOES);
		i.setPrice();
		
		System.out.println("precio anchoas: " + i.getPrice());
		Ingredients i2 = new Ingredients();
		i2.setIngredientsType(IngredientType.ASPARAGUS);
		//i2.updatePrice(IngredientsType.ASPARAGUS, 100.0);
		i2.setPrice();
		
		System.out.println("precio Esparragos: "+i2.getPrice());
		double suma =0;		
		
		suma = i.getPrice()+i2.getPrice();
		System.out.println("El total es : "+suma);
		
		
		HashSet<Ingredients> lista= new HashSet<Ingredients>();
		lista.add(i);
		lista.add(i2);
		
		System.out.println(lista);
		System.out.println(pizza1.totalCost(lista));
		
		
		PizzafactoryBranchA factoryA = new PizzafactoryBranchA();
		Pizza pizzaA = factoryA.createPizza(PizzaTypes.CHEESE);
		//pizzaA.ingredientsList;
		pizzaA.showIngredients();
		pizzaA.aditionIngrediente(i);
		pizzaA.showIngredients();
		//pizzaA.removeIngrediente(i);
		//pizzaA.showIngredients();
		System.out.println(pizzaA.totalCost2());
	
	}
	

}
