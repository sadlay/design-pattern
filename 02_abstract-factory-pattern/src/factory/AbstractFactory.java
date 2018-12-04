package factory;

import interfaces.ColorInterface.Color;
import interfaces.shapeinterface.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 9:52 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
