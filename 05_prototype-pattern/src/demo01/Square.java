package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:47 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
