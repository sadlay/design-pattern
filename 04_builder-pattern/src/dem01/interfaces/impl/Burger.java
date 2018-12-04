package dem01.interfaces.impl;

import dem01.interfaces.Item;
import dem01.interfaces.Packing;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:51 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
