package dem01.interfaces.impl;

import dem01.interfaces.Item;
import dem01.interfaces.Packing;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:52 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();

}
