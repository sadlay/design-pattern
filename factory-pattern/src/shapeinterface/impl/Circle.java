package shapeinterface.impl;

import shapeinterface.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:19 2018/12/3
 * @Modified By:IntelliJ IDEA
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
