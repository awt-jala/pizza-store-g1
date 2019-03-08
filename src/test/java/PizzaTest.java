package test.java;

import org.junit.jupiter.api.Test;

import main.java.p1.CheesePizza;
import main.java.p1.Pizza;
import main.java.p1.PizzaTypes;
import main.java.p1.SimplePizzaFactory;

class PizzaTest {

    @Test
    void test1() {
        final SimplePizzaFactory factoria = new SimplePizzaFactory();
        final Pizza pizza1 = factoria.create(PizzaTypes.CHEESE);
        final String Actual = pizza1.PrintType2();
        final String Expected = "PIZZA CHEESE";
        Assert.assertEquals(Expected, Actual);
    }

    @Test
    void test_comparar_objetos_clases() {
        final SimplePizzaFactory factoria = new SimplePizzaFactory();
        final Pizza ObjetoEsperadoCheese = factoria.create(PizzaTypes.CHEESE);
        final CheesePizza ObjetoDePrueba = new CheesePizza();
        Assert.assertEquals(ObjetoEsperadoCheese.getClass(),
                ObjetoDePrueba.getClass());
        // Assert.assertEquals(Expected, Actual);
    }

}
