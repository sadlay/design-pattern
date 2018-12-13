package demo01.computer.impl;

        import demo01.computer.ComputerPart;
        import demo01.visitor.ComputerPartVisitor;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 15:10 2018/12/13
 * @Modified By:IntelliJ IDEA
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
