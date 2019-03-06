package main.java.p1;

public class MainDeTesteo {

	public static void main(String[] args) {
	/*SimplePizzaFactory 
		
		public Pizza OrderPizza(PizzaTypes type) {
			
			return pizza;
		}*/	
		
		
		SimplePizzaFactory factory = new SimplePizzaFactory();
		Pizza pizza1 = factory.create(PizzaTypes.CHEESE);
		Pizza pizza2 = factory.create(PizzaTypes.GREEK);
		Pizza pizza3 = factory.create(PizzaTypes.PEPPERONI);
		Pizza pizza4 = factory.create(PizzaTypes.VEGGIE);

		
		pizza1.showIngredients();
		
		PizzaStore sucursal1= new PizzaStore();
		//Order o1=sucursal1.createOrder(PizzaTypes.GREEK, 1);
		//sucursal1.addToOrderlist(o1);
		
		
		sucursal1.addToOrderlist(sucursal1.createOrder(PizzaTypes.GREEK, 1));
		sucursal1.addToOrderlist(sucursal1.createOrder(PizzaTypes.CHEESE, 2));
		

		for(Order o:sucursal1.orderList) {
			System.out.println(o.getQuantity());
			System.out.println(o.getPizza().PrintType2());
		}
		
		
		/*pizza1.PrintType2();
		pizza2.PrintType2();
		pizza3.PrintType2();
		pizza4.PrintType2();
		*/
		
		
	}

	
	
}
