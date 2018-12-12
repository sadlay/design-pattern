package demo01.context;

import demo01.state.State;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:02 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
