package demo01.factory;

import demo01.shape.Shape;
import demo01.shape.impl.Circle;

import java.util.HashMap;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:54 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap=new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle) circleMap.get(color);
        if(circle==null){
            circle=new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
