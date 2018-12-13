package demo01.computer.impl;

import demo01.computer.ComputerPart;
import demo01.visitor.ComputerPartVisitor;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:10 2018/12/13
 * @Modified By:IntelliJ IDEA
 */
public class Computer implements ComputerPart {
    ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[]{new Mouse(),new Keyboard(),new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
