package demo01.advancedmedia.impl;

import demo01.advancedmedia.AdvancedMediaPlayer;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:51 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
