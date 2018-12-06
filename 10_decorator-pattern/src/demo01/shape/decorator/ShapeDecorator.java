package demo01.shape.decorator;

import demo01.shape.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 11:33 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }

}
