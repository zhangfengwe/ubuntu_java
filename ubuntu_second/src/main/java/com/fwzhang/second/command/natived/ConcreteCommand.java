package com.fwzhang.second.command.natived;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("具体命令");
        receiver.action();
    }

    @Override
    public void rollBack() {
        System.out.println("具体命令回滚");
        receiver.rollAction();
    }
}
