package dem01.product.drink;

import dem01.interfaces.impl.ColdDrink;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:54 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
