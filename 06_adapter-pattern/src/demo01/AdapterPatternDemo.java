package demo01;

import demo01.media.impl.audio.AudioPlayer;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:57 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
