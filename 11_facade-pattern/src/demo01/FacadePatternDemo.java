package demo01;

import demo01.facade.ShapeFacade;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 14:04 2018/12/6
 * @Modified By:IntelliJ IDEA
 */
public class FacadePatternDemo {
    public static void main(String[] args){
        ShapeFacade shapeFacade=new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
        shapeFacade.drawSquare();
    }
}
