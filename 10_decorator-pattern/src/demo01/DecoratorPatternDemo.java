package demo01;

import demo01.shape.Shape;
import demo01.shape.decorator.impl.RedShapeDecorator;
import demo01.shape.impl.Circle;
import demo01.shape.impl.Rectangle;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 11:36 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
