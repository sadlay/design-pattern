package demo01.state;

import demo01.context.Context;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 17:01 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public interface State {
    public void doAction(Context context);
}
