package com.fwzhang.second.builder.natived;

import com.fwzhang.second.entity.domain.Bike;

/**
 * @ClassName MoBikeBuilder
 * @Description
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class MoBikeBuilder extends AbstractBuilder {

    private Bike moBike;

    public MoBikeBuilder() {
        this.moBike = new Bike();
    }

    @Override
    void buildBody() {
        moBike.setBody("mo 蓝色");
    }

    @Override
    void buildHead() {
        moBike.setHead("mo - 车头 蓝色");
    }

    @Override
    void buildName() {
        moBike.setName("mo - 小蓝车");
    }

    @Override
    Bike construct() {
        return this.moBike;
    }
}
