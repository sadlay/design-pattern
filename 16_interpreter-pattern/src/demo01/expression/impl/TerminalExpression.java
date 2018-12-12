package demo01.expression.impl;

import demo01.expression.Expression;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 12:53 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
