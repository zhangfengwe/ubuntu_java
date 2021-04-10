package com.fwzhang.test.second;

import com.fwzhang.second.strategy.natived.AddStrategy;
import com.fwzhang.second.strategy.natived.Context;
import com.fwzhang.second.strategy.natived.Strategy;
import com.fwzhang.second.strategy.natived.SubStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @ClassName StrategyTest
 * @Description
 * @Author fwzhang
 * @Date 2021/4/10
 * @Version 1.0
 **/

public class StrategyTest {

    private static List<Strategy> strategyList;

    static {
        strategyList = new ArrayList<>();
        strategyList.add(new AddStrategy());
        strategyList.add(new SubStrategy());
    }

    public static void main(String[] args) {
        Context.Builder builder = new Context.Builder();
        Context context = builder.strategyName("sub").builder();
        String strategyName = context.getStrategyName();
        Optional<Strategy> first = strategyList.stream().filter(strategy -> strategy.onStrategy(strategyName)).findFirst();
        if (first.isPresent()) {
            context = builder.strategy(first.get()).builder();
        }
        context.getStrategy().strategy();
    }
}
