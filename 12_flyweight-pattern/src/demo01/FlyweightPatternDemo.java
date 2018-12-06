package demo01;

import demo01.factory.ShapeFactory;
import demo01.shape.impl.Circle;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:57 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class FlyweightPatternDemo {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle =
                    (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
