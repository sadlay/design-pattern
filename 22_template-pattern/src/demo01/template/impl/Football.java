package demo01.template.impl;

import demo01.template.Game;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 19:11 2018/12/12
 * @Modified By:IntelliJ IDEA
 */
public class Football extends Game {

    @Override
    public void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
