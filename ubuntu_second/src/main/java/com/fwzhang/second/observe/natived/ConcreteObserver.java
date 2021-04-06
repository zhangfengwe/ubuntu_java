package com.fwzhang.second.observe.natived;

/**
 * @ClassName ConcreteObserver
 * @Description
 * @Author fwzhang
 * @Date 2021/4/6
 * @Version 1.0
 **/

public class ConcreteObserver implements Observer {

    @Override
    public void update(String message) {
        System.out.println("观察者接收到变化消息： ".concat(message));
    }
}
