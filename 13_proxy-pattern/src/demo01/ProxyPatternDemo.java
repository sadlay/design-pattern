package demo01;

import demo01.image.Image;
import demo01.proxy.ProxyImage;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:42 2018/12/7
 * @Modified By:IntelliJ IDEA
 */
public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image=new ProxyImage("test.jpg");
        //图像将从磁盘加载
        image.display();
        //图片不需要从磁盘加载
        System.out.println("");
        image.display();
    }
}
