package com.fwzhang.second.flyweight.natived;

import java.util.HashMap;
import java.util.Objects;

/**
 * @ClassName FlyweightFactory
 * @Description
 * @Author fwzhang
 * @Date 2021/3/30
 * @Version 1.0
 **/

public class FlyweightFactory {

    private static HashMap<String, Flyweight> flyweightHashMap;

    static {
        flyweightHashMap = new HashMap<>();
    }

    public Flyweight getFlyweight(String key) {
        if (Objects.isNull(flyweightHashMap.get(key))) {
            ConcreteFlyweight concreteFlyweight = new ConcreteFlyweight(key);
            flyweightHashMap.put(key, concreteFlyweight);
            return concreteFlyweight;
        } else {
            return flyweightHashMap.get(key);
        }
    }
}
