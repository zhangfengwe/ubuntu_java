package com.fwzhang.second.command.natived;

public class Receiver {

    public void action() {
        System.out.println("命令真正的执行过程");
    }

    public void rollAction() {
        System.out.println("命令执行后回滚");
    }
}
