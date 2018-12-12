package demo01.context;

import demo01.strategy.Strategy;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 18:56 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
