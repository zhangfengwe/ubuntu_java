package com.fwzhang.second.bridge.natived;

public class CommonMouse implements MouseInterface {
    @Override
    public void move() {
        System.out.println("common mouse moving");
    }
}
