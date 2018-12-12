package demo01;

import demo01.context.Context;
import demo01.state.impl.StartState;
import demo01.state.impl.StopState;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:03 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
