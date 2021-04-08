package com.fwzhang.second.strategy.natived;

/**
 * @ClassName Stragegy
 * @Description
 * @Author fwzhang
 * @Date 2021/4/8
 * @Version 1.0
 **/

public interface Strategy {

    boolean onStrategy(String strategyName);

    void strategy();
}
