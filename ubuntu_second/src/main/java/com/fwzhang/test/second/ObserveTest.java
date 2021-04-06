package com.fwzhang.test.second;

import com.fwzhang.second.observe.natived.ConcreteObserver;
import com.fwzhang.second.observe.natived.ConcreteSubject;

/**
 * @ClassName ObserveTest
 * @Description
 * @Author fwzhang
 * @Date 2021/4/6
 * @Version 1.0
 **/

public class ObserveTest {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.addObserver(new ConcreteObserver());
        concreteSubject.notifyObserver();

    }
}
