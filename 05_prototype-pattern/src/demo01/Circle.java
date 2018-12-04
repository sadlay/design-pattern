package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:47 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
