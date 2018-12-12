package demo01.template;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:05 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //模板
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }
}
