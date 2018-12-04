package demo01;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:52 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class PrototypePatternDemo {
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape=ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
