package com.fwzhang.test.second;

import com.fwzhang.second.flyweight.natived.Flyweight;
import com.fwzhang.second.flyweight.natived.FlyweightFactory;
import com.fwzhang.second.flyweight.natived.UnSharedConcreteFlyweight;

/**
 * @ClassName FlyweightNativedTest
 * @Description
 * @Author fwzhang
 * @Date 2021/3/30
 * @Version 1.0
 **/

public class FlyweightNativedTest {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight("123");
        Flyweight flyweight1 = flyweightFactory.getFlyweight("234");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("123");
        flyweight.operation(new UnSharedConcreteFlyweight("qwe"));
        flyweight1.operation(new UnSharedConcreteFlyweight("asd"));
        flyweight2.operation(new UnSharedConcreteFlyweight("zxc"));
    }
}
