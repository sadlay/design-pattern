package demo01.template.impl;

import demo01.template.Game;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:08 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Cricket extends Game {
    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
