package demo01.shape.impl;

import demo01.draw.DrawAPI;
import demo01.shape.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:43 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Circle extends Shape {

    private int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);

    }
}
