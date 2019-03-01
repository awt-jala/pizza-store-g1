
public class SimplePizzaFactory {
  public Pizza createPizza(String type) 
  {
	  Pizza pizza=null;
	  
	  if(type.contentEquals("cheese")) 
	  {
	     pizza= new CheesePizza();	  
	  }else if (type.contentEquals("pepperoni")) 
	  {
		  pizza= new PepperoniPizza();
	  }else if (type.contentEquals("greek")) 
	  {
		  pizza= new GreekPizza(); 
	  }else if (type.contentEquals("veggie"))
	  {
		  pizza= new VeggiePizza();
	  }
	  return pizza;
  }
}
