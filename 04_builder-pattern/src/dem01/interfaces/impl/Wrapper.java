package dem01.interfaces.impl;

import dem01.interfaces.Packing;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:50 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
