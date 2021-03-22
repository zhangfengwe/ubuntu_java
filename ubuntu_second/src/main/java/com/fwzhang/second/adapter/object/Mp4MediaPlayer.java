package com.fwzhang.second.adapter.object;

/**
 * @ClassName Mp4MediaPlayer
 * @Description
 * @Author fwzhang
 * @Date 2021/3/22
 * @Version 1.0
 **/

public class Mp4MediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String file) {
        System.out.println(file.concat(" mp4 is play"));
    }

    @Override
    public void playVic(String file) {

    }
}
