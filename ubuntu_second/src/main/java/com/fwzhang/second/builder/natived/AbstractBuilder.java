package com.fwzhang.second.builder.natived;

import com.fwzhang.second.entity.domain.Bike;

/**
 * @ClassName AbstractBuilder
 * @Description 抽象构建者
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public abstract class AbstractBuilder {
    abstract void buildBody();
    abstract void buildHead();
    abstract void buildName();

    /**
     * 构建具体产品
     * 可以在这个方法中定义完整的构建过程，不过会加大抽象类的职责，不符合单一职责原则
     * 所以在指挥者那里进行定义完整的构建过程
     * @return
     */
    abstract Bike construct();
}
