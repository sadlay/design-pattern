package demo01;

import demo01.computer.ComputerPart;
import demo01.computer.impl.Computer;
import demo01.visitor.impl.ComputerParDisplayVisitor;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:15 2018/12/13
 * @Modified By:IntelliJ IDEA
 */
public class VisitorPatternDemo {
    public static void main(String[] args){
        ComputerPart computer=new Computer();
        computer.accept(new ComputerParDisplayVisitor());

    }
}
