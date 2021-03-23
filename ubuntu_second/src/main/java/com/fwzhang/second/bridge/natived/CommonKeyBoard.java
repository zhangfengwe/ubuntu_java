package com.fwzhang.second.bridge.natived;

public class CommonKeyBoard implements KeyBoardInterface {
    @Override
    public void knock() {
        System.out.println("common key board knocking");
    }
}
