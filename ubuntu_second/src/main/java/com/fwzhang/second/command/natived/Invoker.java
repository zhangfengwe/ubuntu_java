package com.fwzhang.second.command.natived;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> command;

    public Invoker() {
        this.command = new ArrayList<>();
    }

    public Invoker(List<Command> command) {
        this.command = command;
    }

    public void addCommand(Command command) {
        this.command.add(command);
    }

    public void invoke() {
        for (Command command: this.command) {
            try {
                command.execute();
            } catch (Exception e) {
                command.rollBack();
            }
        }
    }
}
