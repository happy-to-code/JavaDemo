package cn.designpatterns.适配器模式.service.mediaimpl;

import cn.designpatterns.适配器模式.service.AdvancedMediaPlayer;
import cn.designpatterns.适配器模式.service.MediaPlayer;
import cn.designpatterns.适配器模式.service.advanceimpl.Mp4Player;
import cn.designpatterns.适配器模式.service.advanceimpl.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
