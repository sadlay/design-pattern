package shapeinterface.impl;

import shapeinterface.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:58 2018/12/3
 * @Modified By:IntelliJ IDEA
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
