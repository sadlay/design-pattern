package demo01.state.impl;

import demo01.context.Context;
import demo01.state.State;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:03 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
