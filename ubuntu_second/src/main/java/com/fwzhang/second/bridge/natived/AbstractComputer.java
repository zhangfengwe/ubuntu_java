package com.fwzhang.second.bridge.natived;

/**
 * 在抽象层将不同维度的部分组合起来，就是桥接模式
 */
public abstract class AbstractComputer {
    public KeyBoardInterface keyBoard;
    public MouseInterface mouse;

    abstract public void computer();

    public KeyBoardInterface getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoardInterface keyBoard) {
        this.keyBoard = keyBoard;
    }

    public MouseInterface getMouse() {
        return mouse;
    }

    public void setMouse(MouseInterface mouse) {
        this.mouse = mouse;
    }
}
