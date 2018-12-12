package demo01;

import demo01.context.Context;
import demo01.strategy.impl.OperationAdd;
import demo01.strategy.impl.OperationMultiply;
import demo01.strategy.impl.OperationSubstract;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 18:57 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
