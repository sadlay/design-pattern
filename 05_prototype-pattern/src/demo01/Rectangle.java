package demo01;

import java.lang.reflect.Type;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:45 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type="Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
