package com.fwzhang.test.second;

import com.fwzhang.second.adapter.object.MediaPlayerAdapter;

import java.io.File;

/**
 * @ClassName ObjectAdapterTest
 * @Description
 * @Author fwzhang
 * @Date 2021/3/22
 * @Version 1.0
 **/

public class ObjectAdapterTest {

    public static void main(String[] args) {
        File file = new File("adapter.vic");
        MediaPlayerAdapter mediaPlayer = new MediaPlayerAdapter(file);
        mediaPlayer.play(file);
    }
}
