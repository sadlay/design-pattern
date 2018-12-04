package dem01.product.buger;

import dem01.interfaces.impl.Burger;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:53 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
