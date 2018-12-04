package demo01.media.impl.adaptor;

import demo01.advancedmedia.AdvancedMediaPlayer;
import demo01.media.MediaPlayer;
import demo01.advancedmedia.impl.Mp4Player;
import demo01.advancedmedia.impl.VlcPlayer;

/**
 * @Description:
 * @Author: lay
 * @Date: Created in 16:52 2018/12/4
 * @Modified By:IntelliJ IDEA
 */
public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            this.advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
