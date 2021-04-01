package com.fwzhang.test.second;

import com.fwzhang.second.command.natived.ConcreteCommand;
import com.fwzhang.second.command.natived.Invoker;
import com.fwzhang.second.command.natived.Receiver;

public class CommandTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);

        /**
         * 真正对于调用端来说，只需要以下代码即可完成命令的操作
         * 将命令以对象或者是参数传给命令的执行者Invoker
         * 由Invoker调用具体的命令执行过程
         */
        Invoker invoker = new Invoker();
        invoker.addCommand(concreteCommand);
        invoker.invoke();
    }
}
