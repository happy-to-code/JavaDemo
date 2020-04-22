package cn.designpatterns.适配器模式.service;

/**
 * 普通媒体播放器
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
