package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.java.p1.CheesePizza;
import main.java.p1.Pizza;
import main.java.p1.PizzaTypes;
import main.java.p1.SimplePizzaFactory;

class PizzaTest {

	@Test
	void test1() {
		SimplePizzaFactory factoria = new SimplePizzaFactory();
		Pizza pizza1 = factoria.create(PizzaTypes.CHEESE);
		String Actual=pizza1.PrintType2();
		String Expected= "PIZZA CHEESE";
	Assert.assertEquals(Expected, Actual);
	}
	

	@Test
	void test_comparar_objetos_clases() {
		SimplePizzaFactory factoria = new SimplePizzaFactory();
		Pizza ObjetoEsperadoCheese = factoria.create(PizzaTypes.CHEESE);
		CheesePizza ObjetoDePrueba = new CheesePizza();
		Assert.assertEquals(ObjetoEsperadoCheese.getClass(), ObjetoDePrueba.getClass());
			//Assert.assertEquals(Expected, Actual);
	}






}
