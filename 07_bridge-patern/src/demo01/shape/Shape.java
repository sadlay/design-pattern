package demo01.shape;

import demo01.draw.DrawAPI;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:41 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
