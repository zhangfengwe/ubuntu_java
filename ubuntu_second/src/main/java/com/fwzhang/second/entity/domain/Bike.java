package com.fwzhang.second.entity.domain;

/**
 * @ClassName Bike
 * @Description 用于普通构建者模式使用
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class Bike {

    private String body;
    private String head;
    private String name;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "body='" + body + '\'' +
                ", head='" + head + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
