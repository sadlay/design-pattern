package demo01.facade;

import demo01.shape.Shape;
import demo01.shape.impl.Circle;
import demo01.shape.impl.Rectangle;
import demo01.shape.impl.Square;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:01 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
        circle=new Circle();
        rectangle=new Rectangle();
        square=new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
