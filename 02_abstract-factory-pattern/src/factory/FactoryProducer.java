package factory;

import factory.impl.ColorFactory;
import factory.impl.ShapeFactory;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 9:58 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
