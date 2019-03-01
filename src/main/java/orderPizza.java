
public class orderPizza (String type) 
{
  Pizza pizza;
  
  pizza= factory.createPizza(type);
  pizza.prepare();
  pizza.bake();
  pizza.cut();
  pizza.box();
  return pizza;
  }
}
