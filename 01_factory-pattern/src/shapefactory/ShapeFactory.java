package shapefactory;

import shapeinterface.Shape;
import shapeinterface.impl.Circle;
import shapeinterface.impl.Rectangle;
import shapeinterface.impl.Square;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:21 2018/12/3
 * @Modified By:IntelliJ IDEA
 */
public class ShapeFactory {
    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
