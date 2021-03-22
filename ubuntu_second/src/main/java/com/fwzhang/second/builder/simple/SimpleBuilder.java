package com.fwzhang.second.builder.simple;

import com.fwzhang.second.entity.domain.Room;

/**
 * @ClassName SimpleBuilder
 * @Description
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class SimpleBuilder {
    public static void main(String[] args) {
        Room room = new Room.RoomBuilder("one")
                .setChairs("two")
                .setTable("three")
                .build();
        System.out.println(room);
    }
}
