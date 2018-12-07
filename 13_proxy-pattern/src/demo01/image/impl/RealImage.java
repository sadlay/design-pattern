package demo01.image.impl;

import demo01.image.Image;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:15 2018/12/7
 * @Modified By:IntelliJ IDEA
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
