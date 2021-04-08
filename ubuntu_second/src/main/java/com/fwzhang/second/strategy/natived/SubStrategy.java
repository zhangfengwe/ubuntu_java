package com.fwzhang.second.strategy.natived;

import java.util.Objects;

/**
 * @ClassName SubStrategy
 * @Description
 * @Author fwzhang
 * @Date 2021/4/8
 * @Version 1.0
 **/

public class SubStrategy implements Strategy {
    @Override
    public boolean onStrategy(String strategyName) {
        return Objects.equals("sub", strategyName);
    }

    @Override
    public void strategy() {
        System.out.println("sub strategy processing");
    }
}
