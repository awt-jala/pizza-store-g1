package main.java.p1;

public class LasagnaBranchA extends Lasagna {
    private static final double LASAGNA_COST_BASE = 5;
    IngredientsLasagna ing1;
    IngredientsLasagna ing2;
    IngredientsLasagna ing3;
    IngredientsLasagna ing4;
    IngredientsLasagna ing5;
    IngredientsLasagna ing6;
    IngredientsLasagna ing7;

    LasagnaBranchA() {
        super(LasagnaType.STANDAR);
        lasagnaCost = LASAGNA_COST_BASE;

        ing1 = new IngredientsLasagna();
        ing1.setIngredientsType(IngredientType.LASAGNA_NOODLES);
        ing1.setPrice();
        ing2 = new IngredientsLasagna();
        ing2.setIngredientsType(IngredientType.MEAT);
        ing2.setPrice();
        ing3 = new IngredientsLasagna();
        ing3.setIngredientsType(IngredientType.PLUM_TOMATO_SAUCE);
        ing3.setPrice();
        ing4 = new IngredientsLasagna();
        ing4.setIngredientsType(IngredientType.GARLIC);
        ing4.setPrice();
        ing5 = new IngredientsLasagna();
        ing5.setIngredientsType(IngredientType.OREGANO);
        ing5.setPrice();
        ing6 = new IngredientsLasagna();
        ing6.setIngredientsType(IngredientType.MOZARELLA_CHEESE);
        ing6.setPrice();
        ing7 = new IngredientsLasagna();
        ing7.setIngredientsType(IngredientType.PARMESAN_CHEESE);
        ing7.setPrice();

        ingredientsList.add(ing1);
        ingredientsList.add(ing2);
        ingredientsList.add(ing3);
        ingredientsList.add(ing4);
        ingredientsList.add(ing5);
        ingredientsList.add(ing6);
        ingredientsList.add(ing7);

    }

}
