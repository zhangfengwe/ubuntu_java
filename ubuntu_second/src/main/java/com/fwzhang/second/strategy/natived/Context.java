package com.fwzhang.second.strategy.natived;

/**
 * @ClassName Context
 * @Description
 * @Author fwzhang
 * @Date 2021/4/8
 * @Version 1.0
 **/

public class Context {

    private final String strategyName;

    private final Strategy strategy;

    public Context(Builder builder) {
        this.strategyName = builder.strategyName;
        this.strategy = builder.strategy;
    }

    public static class Builder {
        private String strategyName;

        private Strategy strategy;

        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            return this;
        }

        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            return this;
        }

        public Context builder() {
            return new Context(this);
        }
    }

    public String getStrategyName() {
        return strategyName;
    }

    public Strategy getStrategy() {
        return strategy;
    }


}
