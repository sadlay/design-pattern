package demo01.state.impl;

import demo01.context.Context;
import demo01.state.State;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:02 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
