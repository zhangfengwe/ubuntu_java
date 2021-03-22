package com.fwzhang.second.builder.natived;

import com.fwzhang.second.entity.domain.Bike;

/**
 * @ClassName OfoBikeBuilder
 * @Description
 * @Author fwzhang
 * @Date 2021/3/21
 * @Version 1.0
 **/

public class OfoBikeBuilder extends AbstractBuilder {
    private Bike ofoBike;

    public OfoBikeBuilder() {
        this.ofoBike = new Bike();
    }

    @Override
    void buildBody() {
        ofoBike.setBody("Ofo 黄色");
    }

    @Override
    void buildHead() {
        ofoBike.setHead("Ofo 车头 - 黄色");
    }

    @Override
    void buildName() {
        ofoBike.setName("Ofo");
    }

    @Override
    Bike construct() {
        return this.ofoBike;
    }
}
