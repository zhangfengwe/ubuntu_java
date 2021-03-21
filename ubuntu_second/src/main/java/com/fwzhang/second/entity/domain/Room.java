package com.fwzhang.second.entity.domain;

/**
 * @ClassName Room
 * @Description 房间类
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class Room {
    private final String bed;
    private final String chairs;
    private final String table;

    public Room(RoomBuilder builder) {
        this.bed = builder.bed;
        this.chairs = builder.chairs;
        this.table = builder.table;
    }

    public static class RoomBuilder {
        // 床 - 必须
        private String bed;
        // 椅子 - 非必须
        private String chairs;
        // 桌子 - 非必须
        private String table;

        public RoomBuilder(String bed) {
            this.bed = bed;
        }

        public RoomBuilder setChairs(String chairs) {
            this.chairs = chairs;
            return this;
        }

        public RoomBuilder setTable(String table) {
            this.table = table;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }

    public String getBed() {
        return bed;
    }

    public String getChairs() {
        return chairs;
    }

    public String getTable() {
        return table;
    }

    @Override
    public String toString() {
        return "Room{" +
                "bed='" + bed + '\'' +
                ", chairs='" + chairs + '\'' +
                ", table='" + table + '\'' +
                '}';
    }
}
