package factory.impl;

import factory.AbstractFactory;
import interfaces.ColorInterface.Color;
import interfaces.shapeinterface.Shape;
import interfaces.shapeinterface.impl.Circle;
import interfaces.shapeinterface.impl.Rectangle;
import interfaces.shapeinterface.impl.Square;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 9:54 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        if(shape==null) {
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }


}
