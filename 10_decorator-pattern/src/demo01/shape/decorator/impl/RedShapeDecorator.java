package demo01.shape.decorator.impl;

import demo01.shape.Shape;
import demo01.shape.decorator.ShapeDecorator;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 11:35 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
