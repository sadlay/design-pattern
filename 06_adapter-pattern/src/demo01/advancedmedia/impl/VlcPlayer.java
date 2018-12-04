package demo01.advancedmedia.impl;

import demo01.advancedmedia.AdvancedMediaPlayer;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:51 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
