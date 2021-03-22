package com.fwzhang.second.adapter.object;

import java.io.File;

/**
 * @ClassName MediaPlayerAdapter
 * @Description
 * @Author fwzhang
 * @Date 2021/3/22
 * @Version 1.0
 **/

public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;
    private String type;

    public MediaPlayerAdapter(File file) {
        String fileName = file.getName();
        int index = fileName.indexOf('.');
        type = fileName.substring(index + 1);
        if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4MediaPlayer();
        } else if (type.equalsIgnoreCase("vic")) {
            advancedMediaPlayer = new VicMediaPlayer();
        } else {
            throw new UnsupportedOperationException("不支持该文件类型， type: ".concat(type));
        }

    }

    @Override
    public void play(File audioFile) {
        if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(audioFile.getName());
        } else {
            advancedMediaPlayer.playVic(audioFile.getName());
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
