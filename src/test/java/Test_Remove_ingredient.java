package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import factory.FactoryBranchA;
import ingredient.IngredientType;
import ingredient.Ingredients;
import pizza.AbstractPizza;
import pizza.PizzaTypes;

class Test_Remove_ingredient {

    @Test
    void test_Total_cost_remove_ingredients() {
        final FactoryBranchA factoryA = new FactoryBranchA();
        final AbstractPizza pizzaA2 = factoryA.createPizza(PizzaTypes.CHEESE);
        pizzaA2.showIngredients();
        System.out.println(pizzaA2.getTotalCostIngredientsList());
        pizzaA2.removeIngrediente(IngredientType.MOZARELLA_CHEESE);
        pizzaA2.showIngredients();
        final double expectedResult = 38.5;
        final double actualResult = pizzaA2.getTotalCostIngredientsList();
        assertEquals(expectedResult, actualResult);

    }

   
}
