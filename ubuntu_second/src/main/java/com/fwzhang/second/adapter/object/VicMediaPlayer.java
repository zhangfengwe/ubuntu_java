package com.fwzhang.second.adapter.object;

/**
 * @ClassName VicMediaPlayer
 * @Description
 * @Author fwzhang
 * @Date 2021/3/22
 * @Version 1.0
 **/

public class VicMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String file) {
    }

    @Override
    public void playVic(String file) {
        System.out.println(file.concat(" vic is play"));
    }
}
