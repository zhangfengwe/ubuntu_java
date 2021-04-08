package com.fwzhang.second.strategy.natived;

import java.util.Objects;

/**
 * @ClassName AddStrategy
 * @Description
 * @Author fwzhang
 * @Date 2021/4/8
 * @Version 1.0
 **/

public class AddStrategy implements Strategy {
    @Override
    public boolean onStrategy(String strategyName) {
        return Objects.equals("add", strategyName);
    }

    @Override
    public void strategy() {
        System.out.println("add strategy processing");
    }
}
