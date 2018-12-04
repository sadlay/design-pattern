package interfaces.ColorInterface.impl;

import interfaces.ColorInterface.Color;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 9:49 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
