package dem01.meal;

import dem01.product.buger.ChickenBurger;
import dem01.product.buger.VegBuger;
import dem01.product.drink.Coke;
import dem01.product.drink.Pepsi;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:57 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBuger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
