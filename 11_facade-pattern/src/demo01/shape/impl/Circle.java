package demo01.shape.impl;

import demo01.shape.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:00 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
