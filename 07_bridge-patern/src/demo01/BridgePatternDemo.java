package demo01;

import demo01.draw.impl.GreenCircle;
import demo01.draw.impl.RedCircle;
import demo01.shape.Shape;
import demo01.shape.impl.Circle;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:44 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class BridgePatternDemo {
    public static void main(String[] args){
        Shape redCircle=new Circle(new RedCircle(),100,100,10);
        Shape greenCircle=new Circle(new GreenCircle(),100,100,10);

        redCircle.draw();
        greenCircle.draw();


    }
}
