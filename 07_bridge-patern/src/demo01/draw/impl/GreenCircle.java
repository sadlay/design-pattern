package demo01.draw.impl;

import demo01.draw.DrawAPI;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:39 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
