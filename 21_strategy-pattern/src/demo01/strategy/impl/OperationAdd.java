package demo01.strategy.impl;

import demo01.strategy.Strategy;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 18:55 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
