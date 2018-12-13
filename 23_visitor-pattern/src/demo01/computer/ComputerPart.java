package demo01.computer;

import demo01.visitor.ComputerPartVisitor;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:17 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
