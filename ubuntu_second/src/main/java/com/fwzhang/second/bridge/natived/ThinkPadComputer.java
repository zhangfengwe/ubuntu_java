package com.fwzhang.second.bridge.natived;

public class ThinkPadComputer extends AbstractComputer {

    public ThinkPadComputer(KeyBoardInterface keyBoard, MouseInterface mouse) {
        this.setKeyBoard(keyBoard);
        this.setMouse(mouse);
    }


    @Override
    public void computer() {
        this.getKeyBoard().knock();
        this.getMouse().move();
        System.out.println("thinkPad running");
    }
}
