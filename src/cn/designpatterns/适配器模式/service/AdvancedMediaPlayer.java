package cn.designpatterns.适配器模式.service;

/**
 * 高级媒体播放器
 */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}
