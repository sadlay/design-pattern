package demo01.visitor.impl;

import demo01.computer.impl.Computer;
import demo01.computer.impl.Keyboard;
import demo01.computer.impl.Monitor;
import demo01.computer.impl.Mouse;
import demo01.visitor.ComputerPartVisitor;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:15 2018/12/13
 * @Modified By:IntelliJ IDEA
 */
public class ComputerParDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}
