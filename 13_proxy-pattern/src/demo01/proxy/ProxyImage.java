package demo01.proxy;

import demo01.image.Image;
import demo01.image.impl.RealImage;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:18 2018/12/7
 * @Modified By:IntelliJ IDEA
 */
public class ProxyImage implements Image {
    private Image realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage==null){
            realImage=new RealImage(fileName);
        }
        realImage.display();
    }
}
