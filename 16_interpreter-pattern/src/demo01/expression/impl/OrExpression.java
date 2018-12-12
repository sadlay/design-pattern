package demo01.expression.impl;

import demo01.expression.Expression;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 12:54 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class OrExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) || expr2.interpret(context);
    }
}
