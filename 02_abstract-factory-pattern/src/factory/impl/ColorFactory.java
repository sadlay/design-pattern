package factory.impl;

import factory.AbstractFactory;
import interfaces.ColorInterface.Color;
import interfaces.ColorInterface.impl.*;
import interfaces.shapeinterface.Shape;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 9:56 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
