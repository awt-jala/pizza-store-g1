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

		
		pizza1.PrintType();
		pizza2.PrintType();
		pizza3.PrintType();
		pizza4.PrintType();
		
		
		/*Ingredients extras = new Ingredients();
		extras.setChampignone(true);
		extras.setPineapple(true);
		//extras.
		
		System.out.println("el extra de champiñoñ es: "+ extras.champignone );
		*/
	}

	
	
}
