package demo01.visitor;

import demo01.computer.impl.Computer;
import demo01.computer.impl.Keyboard;
import demo01.computer.impl.Monitor;
import demo01.computer.impl.Mouse;


/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:18 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
